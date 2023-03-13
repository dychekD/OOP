package OOP;

public class Monk extends Magicians {

    private int potions;

    public Monk() {
        super("Harold", 50, 0, 0, 0, 100);
        this.potions = 3;
    }

    @Override
    public String getInfo () {
        return "Monk";
    }

    // Action: can heal 
    
}
