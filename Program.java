package OOP;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static final int GANG_SIZE = 10;
    public static ArrayList <BaseHero> whiteSide = new ArrayList<>();;
    public static ArrayList <BaseHero> darkSide = new ArrayList<>();;
    public static ArrayList <BaseHero> allUnits = new ArrayList<>();;

    private static String receiveName (){
        String name = Names.values()[new Random().nextInt (Names.values().length)].toString();
        return name;
    }
    public static void main(String[] args) {
        Init();
        Scanner sc = new Scanner(System.in);
        while (true) {
            ConsoleView.view();
            makeStep();
            sc.nextLine();
        }
    }

    private static void Init (){
        for (int i = 1; i < GANG_SIZE+1; i++) {
            switch (new Random().nextInt (4)) {
                case 0: 
                    whiteSide.add (new Peasant (receiveName(), 1, i));
                    break;
                case 1: 
                    whiteSide.add (new Robber (receiveName(), 1, i));
                    break;
                case 2: 
                    whiteSide.add (new Sniper (receiveName(), 1, i));
                    break;
                default: 
                    whiteSide.add (new Wizard (receiveName(), 1, i));
                    break;
                }
        }
        for (int i = 1; i < GANG_SIZE+1; i++) {
            switch (new Random().nextInt (4)) {
                case 0: 
                    darkSide.add (new Peasant (receiveName(), 10, i));
                    break;
                case 1: 
                    darkSide.add (new Spearman (receiveName(), 10, i));
                    break;
                case 2: 
                    darkSide.add (new Crossbowman (receiveName(), 10, i));
                    break;
                default: 
                    darkSide.add (new Monk (receiveName(), 10, i));
                    break;
                }
        }
                
    }


    private static void makeStep () {
        allUnits
        .addAll (whiteSide);
        allUnits.addAll (darkSide);

        allUnits.sort(new Comparator <BaseHero> () {
            @Override
            public int compare (BaseHero h1, BaseHero h2) {
                if (h1.getSpeed() == h2.getSpeed()) return 0;
                else if (h1.getSpeed() > h2.getSpeed()) return -1;
                else return 1;
            }
        }
        );
        for (BaseHero bh: allUnits) {
            if (whiteSide.contains(bh)) bh.step(whiteSide, darkSide);
            else bh.step(darkSide, whiteSide);
        }
    }
}