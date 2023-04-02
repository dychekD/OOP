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
    public void step (ArrayList <BaseHero> team1, ArrayList <BaseHero> team2) {
        if (this.health == 0 && this.arrows == 0) System.out.println("Cannot shoot");
        else {
            System.out.println("Can shoot");
            int target = super.Target(team2);
            if (team2.get(target).health > 0) {
                super.Attack (team2.get(target));
                this.arrows --;
                for (BaseHero friend : team1) {
                    if (friend.getInfo() == "Peasant" && friend.delivery >0) {
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
    

