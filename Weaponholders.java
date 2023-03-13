package OOP;

public abstract class Weaponholders extends BaseHero {

    protected int sharpshooting;

    public Weaponholders(String name, int health, int expirience, int level, int gold, int sharpshooting) {
        super(name, health, expirience, level, gold);
        this.sharpshooting = sharpshooting;
    }

    //Action: increases damage
    
}
