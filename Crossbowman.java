package OOP;

public class Crossbowman extends Weaponholders {

    private int bolts;

    public Crossbowman() {
        super("Brian", 80, 30, 2, 18, 20);
        this.bolts = 40;
    }

    @Override
    public String getInfo () {
        return "Crossbowman";
    }

    // Actions: can attack three heroes simultaniously
    
}
