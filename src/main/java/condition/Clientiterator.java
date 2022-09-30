package condition;

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;


public class Clientiterator
{
    public static void main(String[] args)
    {
        System.out.println("Iteradores:");
        //for

        for(int i= 0; i<=10; i++)
        {
            System.out.println("El numero es: "+i);
        }

        //foreach
        List<String> nameList = new ArrayList<>();
        nameList.add("eynar1");
        nameList.add("eynar2");
        nameList.add("eynar3");

        for(String name: nameList)
        {
            System.out.println(name);
        }

        //while
        System.out.println("********* WHILE *********");
        boolean flag = true;
        int numEstudiantes = 0;
        while(flag)
        {

            flag = numEstudiantes <= 10?true:false;
            numEstudiantes++;
            System.out.println("estudiantes: "+numEstudiantes);
        }

        //do while
        numEstudiantes = 0;
        do
        {
            flag = numEstudiantes <=10?true:false;
            numEstudiantes++;
            System.out.println("DO While --> estudiantes: " + numEstudiantes);
        }while (flag);

        //expresiones lambda
    }
}
