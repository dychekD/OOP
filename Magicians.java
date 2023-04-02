package OOP;

public abstract class Magicians extends BaseHero {

    protected int magic;

    public Magicians(String name, int health, int attack, int damage, int defence, int speed, int x, int y, int delivery, int magic) {
        super(name, health, attack, damage, defence, speed, x, y, delivery);
        this.magic = magic;
    }

    @Override
    public String toString () {
        return String.format ("%s; magic: %d", super.toString(), this.magic);
    }
    

    // Actions: can attack multiple players 
    
}
