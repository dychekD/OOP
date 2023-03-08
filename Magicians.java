package OOP;

public class Magicians extends BaseHero {

    protected int knowledge;

    public Magicians(String name, int health, int expirience, int level, int gold, int knowledge) {
        super(name, health, expirience, level, gold);
        this.knowledge = knowledge;
    }

    // Actions: can attack multiple players 
    
}
