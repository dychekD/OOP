package OOP;

public class Spearman extends Weaponholders {

    public Spearman(String name) {
        super(name, 10, 4, 3, 5, 4);
    }

    @Override
    public String getInfo () {
        return "Spearman";
    }
    
    @Override
    public String toString () {
        return super.toString();
    }
    
    // Action: can attack even without spears with reduced damage
}
