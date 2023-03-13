package OOP;

public abstract class BaseHero implements HeroInterface {
    protected String name;
    protected int health;
    protected int expirience;
    protected int level;
    protected int gold;

    public BaseHero (String name, int health, int expirience, int level, int gold) {
        this.name = name;
        this.health = health;
        this.expirience = expirience;
        this.level = level;
        this.gold = gold;
    }

    @Override
    public void step (){};

    @Override
    public String getInfo () {
        return "";
    }

    // Actions: attacks, gets damage, restores health, upgrades level, increase expirience, make purchases
}