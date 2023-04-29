import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TreasureRoom extends MapTile{
    public TreasureRoom(int x, int y) {
        super(x, y);
    }
    private String[] TREAS_INTRO = {"A shining stone... looks valuable.", "Places like this seem too good to be true, have an eye out.",
            "Take what you can, but remember... these aren't yours.", "Silvers, Gold, AND diamonds! Look out for traps ",
            "The ground glimmers. Woah ","Let's hope not to meet any scary scavengers here. Quick! Make your pick "};

    public String intro_text(){
        return TREAS_INTRO[(int) (java.lang.Math.random() * TREAS_INTRO.length)];
    }

    public void modify_player(Player player) throws IOException {
        int rand = new Random().nextInt(4);
        if (rand == 1) {
            System.out.print("Score! A Mace!");
            Player.inventory.add(new Mace("Mace", "Fairly used Mace....wander how it got here", 5, (int) (java.lang.Math.random() * 15)));
        } else if (rand == 2) {
            System.out.println("Awesome! we just got some gold!");
            Player.inventory.add((new Gold(((int) (java.lang.Math.random() * 50)))));
        } else if (rand == 3) {
            System.out.print("A huge shine comes from a rock \n Would you check it out? y/n: ");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            char response_input = in.readLine().charAt(0);
            if (response_input == 'y') {
                int rInput = new Random().nextInt(3);
                if (rInput == 1){
                    Zombie.drawZombie();
                    System.out.println("A zombie. These are never friendly!");
                    Zombie zombie = new Zombie(5);
                    Zombie.attackZombie(zombie);
                    if (new Random().nextInt(2) == 2){
                        System.out.print("\nOh no! you just inhaled a powdered quadriceps fungus from the zombie");
                        Player.hp -= new Random().nextInt(10);
                    }
                } else if (rInput == 2) {
                    System.out.println("Eureka! A gem! We have a GEM!");
                    PreciousStone preciousStone = new PreciousStone("A medium stone with a red color");
                    Player.inventory.add(preciousStone);
                } else if (rInput == 3) {
                    System.out.println("SKKKKKKK! \n OH NO! A giant spider!!");
                    GiantSpider.drawSpider();
                    GiantSpider spider = new GiantSpider();
                    Player.attackEnemy(spider);
                    if(!spider.IsAlive()){
                        PreciousStone preciousStone = new PreciousStone("A small shiny gem ");
                        Player.inventory.add(preciousStone);
                        System.out.println("Looks like this spider left us a gift. ");
                    }
                }
            }
        }else if (rand == 4) {
            Enemy enemy = new Enemy("Other traveler", 8, 4);
            System.out.println("You encountered another traveler!");
            int rInput = new Random().nextInt(3);
            if (rInput == 1){
                Player.inventory.remove((int) (java.lang.Math.random() * Player.inventory.size()));
                System.out.println("They are attempting to steal from you!");
                Enemy.drawsmolEnemy();
                Player.attackEnemy(enemy);
            } else if (rInput == 2) {
                System.out.println("They handed you a gift");
                Player.inventory.add(new Sword());
            } else if (rInput == 3) {
                System.out.println("The small traveler coughed in your face! oh I hope they weren't too sick");
                Player.hp -= (int) (java.lang.Math.random() * 10);
                System.out.print("\nYour health is now" + ' ' + Player.hp);
                int benefit = new Random().nextInt(2);
                if (benefit == 1){
                    Mapp truMapp = new Mapp();
                    Player.inventory.add(truMapp);
                    if(Player.inventory.contains(truMapp)){
                        System.out.println("The map says give a precious stone to the King Ogre");
                    }
                }if (benefit == 2){
                    Player.attackEnemy(enemy);
                }
            }
        }
    }
}
