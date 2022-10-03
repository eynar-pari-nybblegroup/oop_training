package condition;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.ArrayList;
import java.util.List;

public class ClientIterator {

    public static void main(String[] args) {

        // For
        // 1ero -> Variable Iterador / 2do -> Condition / 3ero -> Increment/Decrement
        for (int i = 0; i <= 10; i++){
            System.out.println("El numero es: "+i);
        }

        // Foreach

        List<String> nameList = new ArrayList<>();
        nameList.add("Eynar");
        nameList.add("Federico");
        nameList.add("Alan");

        for (String name: nameList) {
            System.out.println(name);
        }

        // While
        System.out.println("\n ***************** \n");
        boolean flag=true;
        int numEstudiantes=0;

        while (flag){
            flag=numEstudiantes <= 10?true:false;
            numEstudiantes++;
            System.out.println("Num est"+numEstudiantes);

        }

        // Do While
        System.out.println("\n ******* DO WHILE ********** \n");
        flag=true;
        numEstudiantes=0;

        do{
            flag=numEstudiantes <= 10?true:false;
            numEstudiantes++;
            System.out.println("DO WHILE> Num est"+numEstudiantes);
        }   while(flag = false);

    }
}
