package OOP;

public class Monk extends Magicians {

    
    public Monk(String name) {
        super(name, 30, 12, -4, 7, 5, 1);
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
