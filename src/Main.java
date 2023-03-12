public class Main {
    public static void main(String[] args) {
        //load world
        World world = new World();
        world.load_tiles();

        Gold goldBar = new Gold(10);
        Sword magicSword = new Sword();
        Mace bigMace = new Mace("Mace", "Large Mace weapon", 12, 35);
        Pillow softPillow = new Pillow();

        Ogre greenOgre = new Ogre();
        Ogre redOgre = new Ogre();
        Zombie slowZombie = new Zombie(1);

        Zombie fastZombie = new Zombie(3);

        Dog spotDog = new Dog(1);

        DemonMonkey quietMonkey = new DemonMonkey(3);

        Flee flee = new Flee();
        Hit hitAttack = new Hit();
        MoveNorth moveNorth = new MoveNorth();
        MoveEast moveEast = new MoveEast();
        MoveWest moveWest = new MoveWest();
        MoveSouth moveSouth = new MoveSouth();

    }
}
