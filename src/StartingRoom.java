public class StartingRoom extends MapTile{

    public StartingRoom(int x,int y){
        super(x, y);
    }

     public String intro_text(){
        return "You find yourself in a murky room.\n It's strange and there is no one around you. Keep your guard up";
    }

    @Override
    public void modify_player(Player player) {
       int rHapp =  (int) (java.lang.Math.random() * 10);
        if (rHapp == 3){
            Dog dog = new Dog();
            if (dog.amicability < 5){
                    System.out.println("This dog does not seem friendly. Best Run!");
                }
                else
                {System.out.println("You've come across a dog. Best keep your guard up");}
            }
        }
    }