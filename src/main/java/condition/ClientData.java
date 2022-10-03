package condition;

import java.util.*;

public class ClientData {
    public static void main(String[] args) {
        // arrays
        String [] nameStudent = new String[6];
        nameStudent[0]="julian";
        nameStudent[1]="enzo";
        nameStudent[2]="fedeP";
        nameStudent[3]="fedeR";
        nameStudent[4]="Agu";
        nameStudent[5]="Emma";

        System.out.println(" ARRAY ");
        for (int i = 0; i < nameStudent.length; i++) {
            System.out.println("name "+nameStudent[i]);
        }

        // list/vector/stacks

        List <String> nameStudentList = new ArrayList<>();
        nameStudentList.add("julian");
        nameStudentList.add("enzo");
        nameStudentList.add("fedeP");
        nameStudentList.add("fedeR");
        nameStudentList.add("Agu");
        nameStudentList.add("Emma");
        System.out.println(" LIST ");
        for (String name:nameStudentList
             ) {
            System.out.println("name "+name);
        }

        Vector <String> nameStudentVector = new Vector<>();
        nameStudentVector.add("julian");
        nameStudentVector.add("enzo");
        nameStudentVector.add("fedeP");
        nameStudentVector.add("fedeR");
        nameStudentVector.add("Agu");
        nameStudentVector.add("Emma");
        System.out.println(" VECTOR ");
        for (String name:nameStudentVector
        ) {
            System.out.println("name "+name);
        }
        Stack<String> nameStudentStack = new Stack<>();
        nameStudentStack.add("julian");
        nameStudentStack.add("enzo");
        nameStudentStack.add("fedeP");
        nameStudentStack.add("fedeR");
        nameStudentStack.add("Agu");
        nameStudentStack.add("Emma");
        System.out.println(" STACK ");
        for (String name:nameStudentStack
        ) {
            System.out.println("name "+name);
        }
        // map
        Map <String,String> nameStudentMap = new HashMap<>();

        nameStudentMap.put("ju","julian");
        nameStudentMap.put("en","enzo");
        nameStudentMap.put("fp","fedeP");
        nameStudentMap.put("fr","fedeR");
        nameStudentMap.put("ag","Agu");
        nameStudentMap.put("em","Emma");
        System.out.println(" MAP ");

        for ( String key : nameStudentMap.keySet() ) {
            System.out.println("key: "+key + " value: "+nameStudentMap.get(key) );
        }


    }
}
