package OOP;

public class Wizard extends Magicians{

    public Wizard(String name, int x, int y) {
        super(name, 30, 17, -5, 12, 9, x, y, 0, 1);
    }
    @Override
    public String getInfo () {
        return "Wizard";
    }

    @Override
    public String toString () {
        return super.toString();
    }

    //Action: increases skills of other players
    
}
