import java.util.Random;

public class Dog extends Enemy {

    public int amicability;

    //The tendency for the dog to be friendly
    public Dog() {
        super("dog", 10, 3);
        Friend();
    }

    private void Friend() {
        amicability = (int) (java.lang.Math.random() * 10);
        if (amicability < 5) {
            Isthreat = true;
            System.out.println("This dog does not seem friendly. Best Run!");
        } else {
            System.out.println("You've come across a dog. Best keep your guard up");
        }

    }

    private void Dogattack() {
        while (Dog.this.hp != 0) {
            Player.hp -= damage;
            final String[] DogAttack = {"You were just mauled!", "The dog struck you with its claws!", "That just might bruise",
            "A sharp bite against your ankles...looks bad"};
            System.out.print(DogAttack[(int) (java.lang.Math.random() * DogAttack.length)]);
            System.out.print("Your health is now" + Player.hp);
       //     Player.attackEnemy();
        }
    }
}