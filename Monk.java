package OOP;

public class Monk extends Magicians {

    
    public Monk(String name, int x, int y) {
        super(name, 30, 12, -4, 7, 5, x, y, 0, 1);
    }

    @Override
    public String getInfo () {
        return "Monk";
    }

    @Override
    public String toString () {
        return super.toString();
    }

    // Action: can heal 
    
}
