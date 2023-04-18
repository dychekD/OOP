package OOP;

import java.util.ArrayList;

public abstract class Magicians extends BaseHero {

    protected int magic;

    public Magicians(String name, int health, int attack, int damage, int defence, int speed, int x, int y, int delivery, int magic) {
        super(name, health, attack, damage, defence, speed, x, y, delivery);
        this.magic = magic;
    }

    public void Heal (BaseHero hero) {
        if (hero.health - this.damage <= hero.maxHealth) {
            hero.health = hero.health - this.damage;
        }
        else hero.health = hero.maxHealth;
    }

    @Override
    public String toString () {
        return String.format ("%s; magic: %d", super.toString(), this.magic);
    }

    @Override
    public void step (ArrayList <BaseHero> team1, ArrayList <BaseHero> team2) {
        if (this.health > 0){
            int target = super.Target(team1);
            if (team1.get(target).health > 0 && team1.get(target).maxHealth < team1.get(target).health) {
                this.Heal(team1.get(target));
            }
        }
    }

    // Actions: can attack multiple players 
    
}
