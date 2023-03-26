package OOP;

public class Sniper extends Shooter{

    public Sniper(String name) {
        super(name, 15, 12, 10, 10, 9, 32);
    }

    @Override
    public String getInfo () {
        return "Sniper";
    }

    @Override
    public String toString () {
        return super.toString();
    }
    // Actions: lethal attack, double gold for killing targets in town  
}
