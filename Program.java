package OOP;
import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        ArrayList <BaseHero> list1 = new ArrayList<>();
        ArrayList <BaseHero> list2 = new ArrayList<>();
        list1 = listik (list1);
        list2 = listik (list2);
    
        list1.forEach(u -> System.out.println(u.getInfo()));
        System.out.println();
        list2.forEach(u -> System.out.println(u.getInfo()));
    }

    public static ArrayList <BaseHero> listik (ArrayList<BaseHero> empty){
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt (7)) {
                case 0: 
                    empty.add (new Peasant ());
                    break;
                case 1: 
                    empty.add (new Robber ());
                    break;
                case 2: 
                    empty.add (new Wizard ());
                    break;
                case 3: 
                    empty.add (new Monk ());
                    break;
                case 4: 
                    empty.add (new Crossbowman ());
                    break;
                case 5: 
                    empty.add (new Spearman ());
                    break;
                default: 
                    empty.add (new Sniper ());
                    break;
                }
        }
        return empty;
    }
}
