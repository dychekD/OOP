package OOP;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements HeroInterface {
    protected int health;
    protected int attack;
    protected int damage;
    protected int defence;
    protected int speed;
    protected final String NAME;

    public BaseHero (String name, int health, int attack, int damage, int defence, int speed) {
        NAME = name;
        this.health = health;
        this.attack = attack;
        this.damage = damage;
        this.defence = defence;
        this.speed = speed;
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

    @Override
    public void step (ArrayList <BaseHero> team1, ArrayList <BaseHero> team2){};

    @Override
    public String getInfo () {
        return "";
    }

    @Override
    public String toString () {
        return String.format ("name: %s; health: %d; attack: %d; damage: %d; defence: %d; speed: %d", 
        this.NAME, this.health, this.attack, this.damage, this.defence, this.speed);
    }


    
    
    // Actions: attacks, gets damage, restores health, upgrades level, increase expirience, make purchases
}