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
    protected int maxHealth;

    public BaseHero (String name, int health, int attack, int damage, int defence, int speed, int x, int y, int delivery) {
        NAME = name;
        this.health = health;
        this.maxHealth = health;
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
            if (distanceTemp < distance && bh.health > 0) {
                distance = distanceTemp;
                target = enemies.indexOf (bh);
            }
        }
        return target;
    }

    public Coordinates getPosition () {
        return xy;
    }

    public void Direction (Coordinates target) {
        int dx = Math.abs(this.xy.x - target.x);
        int dy = Math.abs (this.xy.y - target.y);
        if (dx > dy) {
            if (this.xy.x > target.x) this.xy.x -=1;
            else this.xy.x +=1;
        }
        else {
            if (this.xy.y > target.y) this.xy.y -=1;
            else this.xy.y +=1;
        }
    }
    

    @Override
    public void step (ArrayList <BaseHero> team1, ArrayList <BaseHero> team2){};

    @Override
    public String getName () {
        return "";
    }

    @Override
    public String toString () {
        return String.format ("name: %s; health: %d; attack: %d; damage: %d; defence: %d; speed: %d; coordinates: (%d, %d); delivery: %d", 
        this.NAME, this.health, this.attack, this.damage, this.defence, this.speed, this.xy.x, this.xy.y, this.delivery);
    }

    @Override
    public String getInfo (){
        String outStr = String.format("\t%-3s\tattack: %-3d\tdefence: %-3d\thealth: %-3d\tdamage: %-3d\t ", getName(), attack, defence,health,damage);
        return outStr;
    }


    
    
    // Actions: attacks, gets damage, restores health, upgrades level, increase expirience, make purchases
}