package condition;

import java.util.*;

public class ClientData {

    public static void main(String[] args) {

        //Arrays
        String [] nameStudent = new String[5];
        nameStudent[0] = "Eynar";
        nameStudent[1] = "Julian";
        nameStudent[2] = "Enzo";
        nameStudent[3] = "Fede P";
        nameStudent[4] = "Fede R";

        for (int i=0; i<nameStudent.length; i++){
            System.out.println("Student name's: "+nameStudent[i]);
        }

        //Listas/Vectores/Stacks
        List<String> nameStudentList = new ArrayList<>();
        nameStudentList.add("Julian");
        nameStudentList.add("Fede Padin");
        nameStudentList.add("Fede Roman");
        nameStudentList.add("Agus");
        nameStudentList.add("Enzo");
        nameStudentList.add("Ema");


        System.out.println("********* LIST **********");
        for (String name: nameStudentList) {
            System.out.println("Names: "+name);
        }

        Vector<String> nameStudentVector = new Vector<>();
        nameStudentVector.add("Julian");
        nameStudentVector.add("Fede Padin");
        nameStudentVector.add("Fede Roman");
        nameStudentVector.add("Agus");
        nameStudentVector.add("Enzo");
        nameStudentVector.add("Ema");

        Stack<String> nameStudentStack = new Stack<>();
        nameStudentStack.add("Julian");
        nameStudentStack.add("Fede Padin");
        nameStudentStack.add("Fede Roman");
        nameStudentStack.add("Agus");
        nameStudentStack.add("Enzo");
        nameStudentStack.add("Ema");

        //Map
        Map<String, String> nameStudentMap = new HashMap<>();
        nameStudentMap.put("ju", "julian");
        nameStudentMap.put("en", "enzo");
        nameStudentMap.put("fp", "fedeP");
        nameStudentMap.put("fr", "fedeR");
        nameStudentMap.put("ag", "agus");
        nameStudentMap.put("em", "ema");

        for (String key: nameStudentMap.keySet()) {
            System.out.println("Key: "+key+ " value: "+nameStudentMap.get(key));
        }

    }

}
