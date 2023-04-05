package OOP;

import java.util.ArrayList;

public abstract class Shooter extends BaseHero {

    protected int arrows;

    public Shooter(String name, int health, int attack, int damage, int defence, int speed, int x, int y, int delivery, int arrows) {
        super(name, health, attack, damage, defence, speed, x, y, delivery);
        this.arrows = arrows;
    }

    @Override
    public String toString () {
        return String.format ("%s; arrows: %d", super.toString(), this.arrows);
    }
    @Override
    public String getInfo (){
        String outStr = String.format("\t%-3s\tattack: %-3d\tdefence: %-3d\thealth: %-3d\tdamage: %-3d\tarrows: %-3d\t ", getName(), attack, defence,health,damage,arrows);
        return outStr;
    }

    @Override
    public void step (ArrayList <BaseHero> team1, ArrayList <BaseHero> team2) {
        if (this.health > 0 && this.arrows > 0){
            int target = super.Target(team2);
            if (team2.get(target).health > 0) {
                super.Attack (team2.get(target));
                this.arrows --;
                for (BaseHero friend : team1) {
                    if (friend.getName() == "Peasant" && friend.delivery >0) {
                        this.arrows ++;
                        friend.delivery = 0;
                        break;
                        }
                }
            }
        }
    }
}
    

    
    
    // Actions: travel to nearest town
    

