package conditions;

import java.util.ArrayList;
import java.util.List;

public class ClientIterator {
    public static void main(String[] args) {

        //for
        for (int i=0; i<10; i++){
            System.out.println("El numero es: " + (i+1));
        }

        //for each

        List<String> nameList = new ArrayList<>();
        nameList.add("Juli1");
        nameList.add("Juli2");
        nameList.add("Juli3");

        for (String name : nameList) {
            System.out.println(name);
        }

        //while
        boolean flag = true;
        int estudiantes = 0;
        while(flag){
            flag = estudiantes <= 10 ? true: false;
            estudiantes++;
            System.out.println("num est: " + estudiantes);
        }

        System.out.println("*************DO WHILE************");
        //do while
        estudiantes = 5;
        do{
            flag = estudiantes <= 10 ? true: false;
            estudiantes++;
            System.out.println("num est: " + estudiantes);
        }while (flag);

    }
}
