package OOP;

public class Crossbowman extends Shooter {

    public Crossbowman(String name, int x, int y) {
        super(name, 10, 6, 1, 3, 9, x, y, 0, 7);
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
