public class Zombie extends Enemy {

    private int speed;

    public Zombie(int speed){
        super("Zombie", 10, 6);
        this.speed = speed;
    }
    public static void attackZombie(Enemy zombie){
            zombie.damage = (int) (java.lang.Math.random() * 15);
            int reruns = 5;
            while(reruns!= 0){
                Player.hp -= zombie.damage;
                String[] ZombieAttack = {"\nThe zombie grips your hand ", "\nThe beast just bumped you with its head!",
                        "\n The zombie chomps into your lap ", "\n That has to scar... ", "\nCrAcK!"};
                int randy_OgreAttack = (int) (java.lang.Math.random() * ZombieAttack.length);
                System.out.print(ZombieAttack[randy_OgreAttack]);
                if(ZombieAttack[randy_OgreAttack] == ZombieAttack[3]){
                    Player.hp -= (int) (java.lang.Math.random() * 5);
                }
                System.out.print("\nYour health is now" + ' ' + Player.hp);
                Player.attackEnemy(zombie);
                reruns -= 1;
                if(!zombie.IsAlive()){
                    reruns = 0;
                }
            }
        }
    }

    public static void drawZombie(){
        System.out.println("    _____\n" +
                "              /     \\\n" +
                "             (  x x  )\n" +
                "              \\_ v _/\n" +
                "              / - - \\\n" +
                "_____________/__|=|__\\_____________\n");
    }
}
