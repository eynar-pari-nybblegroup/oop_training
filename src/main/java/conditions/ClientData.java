package conditions;

import java.util.*;

public class ClientData {
    public static void main(String[] args) {

        //arrays

        String [] nameStudent = new String[6];
        nameStudent[0]="Julian";
        nameStudent[1]="Enzo";
        nameStudent[2]="Fede R";
        nameStudent[3]="Fede P";
        nameStudent[4]="Ema";
        nameStudent[5]="Agus";


        System.out.println("ARRAY");

        for (int i=0; i< nameStudent.length; i++){
            System.out.println("name: " + nameStudent[i]);
        }
        //lists/vector/stocks

        List<String> nameStuList = new ArrayList<>();

        nameStuList.add("Julian");
        nameStuList.add("Enzo");
        nameStuList.add("Fede R");
        nameStuList.add("Fede P");
        nameStuList.add("Ema");
        nameStuList.add("Agus");

        System.out.println("ARRAYLIST");

        for (String name: nameStuList) {
            System.out.println("Name: " + name);
        }

        Vector<String> nameStuVector = new Vector<>();
        nameStuVector.add("Julian");
        nameStuVector.add("Enzo");
        nameStuVector.add("Fede R");
        nameStuVector.add("Fede P");
        nameStuVector.add("Ema");
        nameStuVector.add("Agus");

        System.out.println("VECTOR");

        for (String name: nameStuVector) {
            System.out.println("Name: " + name);
        }


        Stack<String> nameStuStack = new Stack<>();
        nameStuStack.add("Julian");
        nameStuStack.add("Julian");
        nameStuStack.add("Julian");
        nameStuStack.add("Julian");
        nameStuStack.add("Julian");
        nameStuStack.add("Julian");

        System.out.println("STACK");

        for (String name: nameStuStack) {
            System.out.println("Name: " + name);
        }

        //map

        Map<String, String> nameStuMap = new HashMap<>();
        nameStuMap.put("ju", "julian");
        nameStuMap.put("en", "enzo");
        nameStuMap.put("fp", "fede p");
        nameStuMap.put("fr", "fede r");
        nameStuMap.put("em", "emma");
        nameStuMap.put("ag", "agus");

        System.out.println("MAPPING");

        for (String key:nameStuMap.keySet()) {
            System.out.println("key: " + key + " Value: " + nameStuMap.get(key));
        }

    }
}
