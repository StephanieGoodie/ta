public class Dog extends Enemy{

    public int amicability;
    //The tendency for the dog to be friendly
    public Dog(int amicability) {
        super("dog", 10, 3);

        Friend();


    }

    private void Friend(){
        if (amicability <= 0) {


            System.out.println("This dog does not seem friendly. Best Run!");


        }
        else  {System.out.println("You've come across a dog. Best keep your guard up");}


    }
}
