package OOP;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        ArrayList <BaseHero> list1 = new ArrayList<>();
        ArrayList <BaseHero> list2 = new ArrayList<>();
        list1 = listOne (list1);
        list2 = listTwo (list2);
        ArrayList <BaseHero> listAll = new ArrayList<>();
        listAll.addAll (list1);
        listAll.addAll (list2);

        listAll.sort(new Comparator <BaseHero> () {
            @Override
            public int compare (BaseHero h1, BaseHero h2) {
                if (h1.getSpeed() == h2.getSpeed()) return 0;
                else if (h1.getSpeed() > h2.getSpeed()) return -1;
                else return 1;
            }
        }
        );
    
        list1.forEach(u -> System.out.println(u.getInfo() + ": "+ u.toString()));
        System.out.println();
        list2.forEach(u -> System.out.println(u.getInfo() + ": "+ u.toString()));
        System.out.println();
        System.out.println("sorted by speed");
        listAll.forEach(u -> System.out.println(u.getInfo() + ": " +u.toString()));
    }

    public static ArrayList <BaseHero> listOne (ArrayList<BaseHero> empty){
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt (4)) {
                case 0: 
                    empty.add (new Peasant (getName()));
                    break;
                case 1: 
                    empty.add (new Robber (getName()));
                    break;
                case 2: 
                    empty.add (new Sniper (getName()));
                    break;
                default: 
                    empty.add (new Wizard (getName()));
                    break;
                }
        }
        return empty;
    }

    public static ArrayList <BaseHero> listTwo (ArrayList<BaseHero> empty){
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt (4)) {
                case 0: 
                    empty.add (new Peasant (getName()));
                    break;
                case 1: 
                    empty.add (new Spearman (getName()));
                    break;
                case 2: 
                    empty.add (new Crossbowman (getName()));
                    break;
                default: 
                    empty.add (new Monk (getName()));
                    break;
                }
        }
        return empty;
    }

    private static String getName (){
        String name = Names.values()[new Random().nextInt (Names.values().length)].toString();
        return name;
    }
}
