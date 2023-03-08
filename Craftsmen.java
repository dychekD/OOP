package OOP;

public class Craftsmen extends BaseHero {

    protected int stamina;

    public Craftsmen(String name, int health, int expirience, int level, int gold, int stamina) {
        super(name, health, expirience, level, gold);
        this.stamina = stamina;
    }

    // Actions: travel to nearest town
    
}
