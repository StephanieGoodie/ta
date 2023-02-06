public class Enemy {

    protected String name;
    protected int health;
    protected int damage;

    public Enemy(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public boolean IsAlive(){
        return(this.health > 0);
    }

    public String toString() {
        return String.format("%s \n=====\n Damage: %s \nHealth: %d \n", this.name, this.damage, this.health);
    }
}
