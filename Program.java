package OOP;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        ArrayList <BaseHero> friends = new ArrayList<>();
        ArrayList <BaseHero> enemies = new ArrayList<>();
        friends = listOne (friends);
        enemies = listTwo (enemies);
        ArrayList <BaseHero> listAll = new ArrayList<>();
        listAll.addAll (friends);
        listAll.addAll (enemies);

        listAll.sort(new Comparator <BaseHero> () {
            @Override
            public int compare (BaseHero h1, BaseHero h2) {
                if (h1.getSpeed() == h2.getSpeed()) return 0;
                else if (h1.getSpeed() > h2.getSpeed()) return -1;
                else return 1;
            }
        }
        );
    
        friends.forEach(u -> System.out.println(u.getInfo() + ": "+ u.toString()));
        System.out.println();
        enemies.forEach(u -> System.out.println(u.getInfo() + ": "+ u.toString()));
        System.out.println();
        System.out.println("sorted by speed");
        listAll.forEach(u -> System.out.println(u.getInfo() + ": " +u.toString()));
        System.out.println("First step");
        for (BaseHero friend: friends) {
            friend.step(friends, enemies);
        }
        for (BaseHero enemy: enemies) {
            enemy.step(enemies, friends);
        }
        friends.forEach(u -> System.out.println(u.getInfo() + ": " +u.toString()));
        System.out.println("");
        enemies.forEach(u -> System.out.println(u.getInfo() + ": " +u.toString()));

    }

    public static ArrayList <BaseHero> listOne (ArrayList<BaseHero> empty){
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt (4)) {
                case 0: 
                    empty.add (new Peasant (getName(), 0, i));
                    break;
                case 1: 
                    empty.add (new Robber (getName(), 0, i));
                    break;
                case 2: 
                    empty.add (new Sniper (getName(), 0, i));
                    break;
                default: 
                    empty.add (new Wizard (getName(), 0, i));
                    break;
                }
        }
        return empty;
    }

    public static ArrayList <BaseHero> listTwo (ArrayList<BaseHero> empty){
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt (4)) {
                case 0: 
                    empty.add (new Peasant (getName(), 9, i));
                    break;
                case 1: 
                    empty.add (new Spearman (getName(), 9, i));
                    break;
                case 2: 
                    empty.add (new Crossbowman (getName(), 9, i));
                    break;
                default: 
                    empty.add (new Monk (getName(), 9, i));
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
