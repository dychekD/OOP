package OOP;

public class Crossbowman extends Shooter {

    public Crossbowman(String name) {
        super(name, 10, 6, 3, 3, 4, 16);
    }

    @Override
    public String getInfo () {
        return "Crossbowman";
    }

    @Override
    public String toString () {
        return super.toString();
    }

    // Actions: can attack three heroes simultaniously
    
}
