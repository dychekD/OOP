package OOP;

public class Wizard extends Magicians{

    private int crystals; 

    public Wizard() {
        super("Merlin", 40, 0, 0, 10, 200);
        this.crystals = 2;
    }
    @Override
    public String getInfo () {
        return "Wizard";
    }

    //Action: increases skills of other players
    
}
