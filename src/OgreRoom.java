import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class OgreRoom extends EnemyRoom{
    public OgreRoom(int x, int y, Enemy enemy) {
        super(x, y, enemy);
    }

    private final String[] OGRE_INTRO = {"Ugly beings lurk around you. Stay clear.", "Life and Death are the only two outcomes being here", "Ogres are not the most friendly",
            "Small beady eyes watch you from a corner. Be stealthy.","Ogres do not usually favor your kind. Don't stick around to find out."};

    public String intro_text(){
        return OGRE_INTRO[new Random().nextInt(OGRE_INTRO.length)];
    }
    public void modify_player(Player player) throws IOException {
        if( intro_text() == OGRE_INTRO[4]){
            System.out.print("Looks like you've been spotted. A 7ft grey-green monster approaches you." );
            Enemy ogre = new Ogre();
            int randy = (int) (java.lang.Math.random() * 3);
            if(randy == 1){
                System.out.print("You are intimidated. \nYou begin to attack the Ogre!");
                Player.attackEnemy(ogre);
                int randy2 = (int) (java.lang.Math.random() * 3);
                if (randy2 == 1){
                    System.out.print("\n....This ogre doesn't seem to be a threat");
                    //non-threatening ogre response
                    int randy3 = (int) (java.lang.Math.random() * 2);
                    if (randy3 == 1){
                        System.out.print("\nThe Ogre insists on compensation for harm you inflicted");
                        System.out.print("\nShow the ogre your inventory? y/n: ");
                        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                        char response_input = in.readLine().charAt(0);
                        if (response_input != 'y') {
                            System.out.print("The Ogre glances at the area you attacked him ");
                            Ogre.OgreCombat(ogre);
                        }else{
                            Item ogreTheft = Player.inventory.remove((int) (java.lang.Math.random() * Player.inventory.size()));
                            System.out.print("\nThe Ogre has taken " +  ogreTheft + "\nBe happy you are alive" );
                        }
                    } else if (randy3 == 2) {
                        System.out.print("\n Another Ogre has spotted you. This one looks.... mad ");
                        Ogre.Isthreat = true;
                        Enemy ogre1 = new Ogre();
                        ogre1.name = "Angry Ogre";
                        Ogre.OgreCombat(ogre);
                        while(!ogre1.IsAlive()){
                            randy3 = 2;
                        }
                    }
                } else if (randy2 == 2) {
                    ogre.Isthreat = true;
                    Ogre.OgreCombat(ogre);
                } else if (randy2 == 3) {
                    ogre.Isthreat = true;
                    Ogre.OgreCombat(ogre);
                    if(!ogre.IsAlive()){



                        System.out.print("that was not easy");
                    }
                }
            }else if(randy == 2){
                System.out.print("You found a space between 2 rock craters. Stay hidden.");
            }else if(randy == 3){
                System.out.print("You make eye contact with this beast.");
            }
        }

    }
}
