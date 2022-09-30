package condition;

import java.util.*;

public class ClientData
{
    public static void main(String[] args)
    {
        // arrays
        String [] nameStudent = new String[6];
        nameStudent[0] = "julian";
        nameStudent[1] = "enzo";
        nameStudent[2] = "fedeP";
        nameStudent[3] = "fedeR";
        nameStudent[4] = "agustin";
        nameStudent[5] = "Ema";

        System.out.println(" 1.ARRAY ");
        for(int i= 0; i<nameStudent.length; i++)
        {
            System.out.println("name: " + nameStudent[i]);
        }

        // list/vector/stacks
        List<String> nameStudentList = new ArrayList<>(); //no tiene limite de posiciones
        nameStudentList.add("julian");
        nameStudentList.add("enzo");
        nameStudentList.add("fedeP");
        nameStudentList.add("fedeR");
        nameStudentList.add("Agus");
        nameStudentList.add("Ema");

        //nameStudentList.size();
        System.out.println("2.LIST: ");
        for(String name: nameStudentList)
        {
            System.out.println("name: "+name);
        }

        //VECTOR
        Vector<String> nameStudentVector = new Vector<>();
        nameStudentVector.add("julian");
        nameStudentVector.add("enzo");
        nameStudentVector.add("fedeP");
        nameStudentVector.add("fedeR");
        nameStudentVector.add("Agus");
        nameStudentVector.add("Ema");

        System.out.println("3.VECTOR:");
        for(String name: nameStudentVector)
        {
            System.out.println("name: "+name);
        }

        //STACK
        Stack<String> nameStudentStack = new Stack<>();
        nameStudentStack.add("julian");
        nameStudentStack.add("enzo");
        nameStudentStack.add("fedeP");
        nameStudentStack.add("fedeR");
        nameStudentStack.add("Agus");
        nameStudentStack.add("Ema");

        System.out.println("4.STACK: ");
        for(String name: nameStudentStack)
        {
            System.out.println("name: "+name);
        }

        // Map(dictionary) --> Almacena pares de valores
        Map<String,String> nameStudentMap = new HashMap<>();
        nameStudentMap.put("ju", "julian");
        nameStudentMap.put("en", "enzo");
        nameStudentMap.put("fp", "FedeP");
        nameStudentMap.put("fr", "FedeR");
        nameStudentMap.put("ag", "Agus");
        nameStudentMap.put("em", "Ema");

        System.out.println("5.MAP: ");
        for(String key: nameStudentMap.keySet())
        {
            System.out.println("Key: "+ key+" / value: "+nameStudentMap.get(key));
        }

    }
}
