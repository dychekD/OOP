package OOP;

import java.util.ArrayList;

public interface HeroInterface {
    void step (ArrayList <BaseHero> team1, ArrayList <BaseHero> team2);
    String getInfo();
    String toString ();
    
}
