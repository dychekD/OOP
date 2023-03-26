package OOP;

public class Robber extends Weaponholders {

    public Robber(String name) {
        super(name, 10, 8, 4, 3, 6);
    }
    @Override
    public String getInfo () {
        return "Robber";
    }

    @Override
    public String toString () {
        return super.toString();
    }
    
    //Actions: steals gold, reduces damage of attacks 
}
