import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class StartingRoom extends MapTile {

    public StartingRoom(int x, int y) {
        super(x, y);
    }

    public String intro_text() {
        final String[] STRT_INTRO = {"You find yourself in a murky room.", "It's strange and there is no one around you. Keep your guard up",
                "Smells of Murk and Dim. You've never been here before ", "You are surrounded by moist and damp walls. Dangers lurk ahead so be on guard"};
        return STRT_INTRO[new Random().nextInt(STRT_INTRO.length)];
    }

    @Override
    public void modify_player(Player player) throws IOException {
       int rHapp =  (int) (java.lang.Math.random() * 10);
        if (rHapp == 3 || rHapp == 6){
            Dog dog = new Dog();
            }
        if(rHapp == 2 || rHapp == 4){
           System.out.print("The floor is muddy");
        }
        if(rHapp == 5 || rHapp == 7 || rHapp == 8 || rHapp == 9){
            System.out.print("Something peeks out of a stone in a corner \n Would you check it out? y/n: ");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            char response_input = in.readLine().charAt(0);
            if (response_input == 'y') {
                int rInput = new Random().nextInt(5);
                if (rInput == 1) {
                    System.out.print("You now have a map");
                    Player.inventory.add(new Map());
                }
                else if (rInput == 2){System.out.print("Oh... this is a detached torso of a dried-up zombie");
                    if (((int) (java.lang.Math.random() * 3)) % 2 == 0) {
                        System.out.print("\nOh no! you just inhaled a powdered quadriceps fungus from the dried corpse");
                        Player.hp -= 5;
                        System.out.print("\nYour health is now " + Player.hp);
                    }
                }
                else if (rInput == 3){
                    System.out.print("shiny, Shiny, SHINY! It looks like you've found yourself some GOLD!");
                Player.inventory.add(new Gold(((int) (java.lang.Math.random() * 50))));}

                else if (rInput == 4) {System.out.print("Shoot... \nYou just woke up a sleeping dog.");
                Dog dog = new Dog();
                dog.amicability = (int) (java.lang.Math.random() * 10);
                    if (dog.amicability <= 5) {
                        dog.Isthreat = true;
                        dog.Dogattack(dog);
                        System.out.println("This dog does not seem friendly. Best Run! ");
                    } else if(dog.amicability > 5){
                        //Isfriend = true;
                        //Dogfriend();
                        System.out.println("You've come across a dog. Keep your guard up ");

                    }
                }
                else if (rInput == 5){
                    System.out.print("What could a cheque for Greenland Community College be doing here?\n Interesting find. ");
                Player.inventory.add(new Junk("$1700 cheque for a Maymester at Greenland Community College"));
                }
                }
            }
        }
    }