package OOP;

public class Sniper extends Weaponholders{

    private int bullets;

    public Sniper() {
        super("Fantom", 70, 60, 4, 15, 50);
        this.bullets = 2;
    }

    @Override
    public String getInfo () {
        return "Sniper";
    }
    
    // Actions: lethal attack, double gold for killing targets in town  
}
