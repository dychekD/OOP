package OOP;

public abstract class Weaponholders extends BaseHero {


    public Weaponholders(String name, int health, int attack, int damage, int defence, int speed, int x, int y, int delivery) {
        super(name, health, attack, damage, defence, speed, x, y, delivery);
    }

    @Override
    public String toString () {
        return super.toString();
    }


    //Action: increases damage
    
}
