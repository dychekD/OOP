package OOP;

import java.util.ArrayList;

public abstract class BaseHero implements HeroInterface {
    protected int health;
    protected int attack;
    protected int damage;
    protected int defence;
    protected int speed;
    protected final String NAME;
    protected Coordinates xy;
    protected int delivery;

    public BaseHero (String name, int health, int attack, int damage, int defence, int speed, int x, int y, int delivery) {
        NAME = name;
        this.health = health;
        this.attack = attack;
        this.damage = damage;
        this.defence = defence;
        this.speed = speed;
        this.xy = new Coordinates(x, y);
        this.delivery = delivery;
    }

    public int getSpeed () {
        return speed;
    }

    public void getDamage (int damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
        }
        else this.health = 0;
    }

    public void Attack (BaseHero hero) {
        hero.getDamage(this.damage);        
    }
    public double Distance (BaseHero bh) {
        return Math.sqrt(Math.pow (this.xy.x - bh.xy.x, 2) + Math.pow (this.xy.y - bh.xy.y, 2));
    }

    public int Target (ArrayList <BaseHero> enemies) {
        double distance = 100;
        double distanceTemp;
        int target = 0;
        for (BaseHero bh: enemies)  {
            distanceTemp = Distance (bh);
            if (distanceTemp < distance) {
                distance = distanceTemp;
                target = enemies.indexOf (bh);
            }
        }
        return target;
    }

    @Override
    public void step (ArrayList <BaseHero> team1, ArrayList <BaseHero> team2){};

    @Override
    public String getInfo () {
        return "";
    }

    @Override
    public String toString () {
        return String.format ("name: %s; health: %d; attack: %d; damage: %d; defence: %d; speed: %d; coordinates: (%d, %d); delivery: %d", 
        this.NAME, this.health, this.attack, this.damage, this.defence, this.speed, this.xy.x, this.xy.y, this.delivery);
    }


    
    
    // Actions: attacks, gets damage, restores health, upgrades level, increase expirience, make purchases
}