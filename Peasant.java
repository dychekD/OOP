package OOP;

public class Peasant extends BaseHero{

    protected int delivery;
    
    public Peasant(String name) {
        super(name, 1, 1, 1, 1, 3);
        this.delivery = 1;
    }

    public int Delivery () {
        return this.delivery;
    }

    @Override
    public String getInfo () {
        return "Peasant";
    }
    @Override
    public String toString () {
        return String.format ("%s delivery: %d", super.toString(), this.delivery);
    }

}
