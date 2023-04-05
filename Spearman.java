package OOP;

public class Spearman extends Weaponholders {

    public Spearman(String name, int x, int y) {
        super(name, 10, 4, 3, 5, 4, x, y, 0);
    }

    @Override
    public String getName () {
        return "Spearman";
    }
    
    @Override
    public String toString () {
        return super.toString();
    }
    
    // Action: can attack even without spears with reduced damage
}
