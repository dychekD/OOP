package OOP;

public class Spearman extends Weaponholders {

    private int spears;

    public Spearman() {
        super("Achilles", 150, 0, 1, 6, 12);
        this.spears = 1;
    }
    @Override
    public String getInfo () {
        return "Spearman";
    }
    
    // Action: can attack even without spears with reduced damage
}
