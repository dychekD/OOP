package OOP;

public class Peasant extends BaseHero{

  
    public Peasant(String name, int x, int y) {
        super(name, 1, 1, 1, 1, 3, x, y, 1);
    }

    @Override
    public String getInfo () {
        return "Peasant";
    }
    

}
