package condition;

import java.util.ArrayList;
import java.util.List;

public class ClientIterator {

    public static void main(String[] args) {

        /*for (int i = 0; i <=10; i++) {
            System.out.println("el numero es: " + i);
        }*/
        List<String> nameList = new ArrayList<>();
        nameList.add("agustin");
        nameList.add("claudio");
        nameList.add("augusto");
        for (String name :
                nameList) {
            System.out.println(name);
        }

        // while
        System.out.println("\n ****************************** \n");
        boolean flag=true;
        int numEstudiantes=0 ;


        while (flag){
            flag=numEstudiantes <= 10?true:false;
            numEstudiantes++;
            System.out.println("num est"+numEstudiantes);
        }

        // do while
        System.out.println("\n ********** DO WHILE ******************** \n");
        flag=true;
        numEstudiantes=0 ;
        do {
            flag=numEstudiantes <= 10?true:false;
            numEstudiantes++;
            System.out.println("DO WHILE>  num est"+numEstudiantes);

        }while( flag);
    }
}
