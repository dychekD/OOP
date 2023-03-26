package OOP;

import java.util.ArrayList;

public abstract class Shooter extends BaseHero {

    protected int arrows;

    public Shooter(String name, int health, int attack, int damage, int defence, int speed, int arrows) {
        super(name, health, attack, damage, defence, speed);
        this.arrows = arrows;
    }

    @Override
    public String toString () {
        return String.format ("%s arrows: %d", super.toString(), this.arrows);
    }

    @Override
    public void step (ArrayList <BaseHero> team1, ArrayList <BaseHero> team2) {
        if (this.health == 0 && this.arrows == 0) System.out.println("Cannot shoot");
        else {
            System.out.println("Can shoot");
            for (BaseHero hero: team2) {
                if (hero.health > 0) {
                    super.Attack (hero);
                    this.arrows --;
                    for (BaseHero friend : team1) {
                        if (friend.getInfo() == "Peasant") {
                            this.arrows ++;
                            break;
                        }
                        
                    }
                }
            }
        }
    }

    
    
    // Actions: travel to nearest town
    
}
