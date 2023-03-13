package OOP;

public class Robber extends Craftsmen {

    private int disguise;

    public Robber() {
        super("Robin", 78, 20, 1, 50, 70);
        this.disguise = 1;
    }
    @Override
    public String getInfo () {
        return "Robber";
    }
    
    //Actions: steals gold, reduces damage of attacks 
}
