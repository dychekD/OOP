package OOP;

public class Crossbowman extends Shooter {

    public Crossbowman(String name, int x, int y) {
        super(name, 10, 6, 3, 3, 4, x, y, 0, 16);
    }

    @Override
    public String getName () {
        return "Crossbowman";
    }

    @Override
    public String toString () {
        return super.toString();
    }

    // Actions: can attack three heroes simultaniously
    
}
