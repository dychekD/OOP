package OOP;

public class Peasant extends BaseHero {

    public Peasant(String name, int x, int y) {
        super(name, 1, 1, 1, 1, 3, x, y, 1);
    }

    @Override
    public String getName() {
        return "Peasant";
    }

    @Override
    public String getInfo() {
        String outStr = String.format("\t%-3s\tattack: %-3d\tdefence: %-3d\thealth: %-3d\tdamage: %-3d\tdelivery: %-3d\t ", getName(), attack, defence,health, damage, delivery);
        return outStr;
    }

}
