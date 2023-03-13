package OOP;

public class Peasant extends Craftsmen{

    public Peasant() {
        super("Olaf", 100, 0, 0, 10, 150);
    }
    @Override
    public String getInfo () {
        return "Peasant";
    }
    
}
