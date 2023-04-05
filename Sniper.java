package OOP;

public class Sniper extends Shooter{

    public Sniper(String name, int x, int y) {
        super(name, 15, 12, 10, 10, 9, x, y, 0, 32);
    }

    @Override
    public String getName () {
        return "Sniper";
    }

    @Override
    public String toString () {
        return super.toString();
    }
    // Actions: lethal attack, double gold for killing targets in town  
}
