package conditionals;

import java.util.ArrayList;
import java.util.List;

public class ClientIterator {
    public static void main(String[] args) {
        //for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //foreach
        List <String> partners = new ArrayList<>();
        partners.add("Enzo");
        partners.add("Fede ");
        partners.add("Fede b");
        partners.add("Agus");
        partners.add("Ema");
        partners.add("Juli");

        System.out.println("Los coworkers son:");
        for (String name: partners) {
            System.out.println(name);
        }

        //while
        boolean pivoter = true;
        int n = 0;
        while (pivoter){
            pivoter = n==6 ? true:false;
            n++;
        }
        System.out.println(pivoter);


        //do while
        int n1 = 0;
        do {
            n1++;
            System.out.println(n1);
        }while (n1<10);
    }
}
