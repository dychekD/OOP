package OOP;

import java.util.ArrayList;

public abstract class Weaponholders extends BaseHero {


    public Weaponholders(String name, int health, int attack, int damage, int defence, int speed, int x, int y, int delivery) {
        super(name, health, attack, damage, defence, speed, x, y, delivery);
    }

    @Override
    public String toString () {
        return super.toString();
    }

    @Override
    public void step (ArrayList <BaseHero> team1, ArrayList <BaseHero> team2) {
        if (this.health > 0){
            int target = super.Target(team2);
            if (team2.get(target).health > 0 && super.Distance (team2.get(target)) <= 2) {
                super.Attack(team2.get(target));
            }
            else if (team2.get(target).health > 0) {
                super.Direction (team2.get(target).xy);


            }
        }

    }


    //Action: increases damage
    
}
