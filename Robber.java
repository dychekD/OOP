package OOP;

public class Robber extends Weaponholders {

    public Robber(String name, int x, int y) {
        super(name, 10, 8, 4, 3, 6, x, y, 0);
    }
    @Override
    public String getName () {
        return "Robber";
    }

    @Override
    public String toString () {
        return super.toString();
    }
    
    //Actions: steals gold, reduces damage of attacks 
}
