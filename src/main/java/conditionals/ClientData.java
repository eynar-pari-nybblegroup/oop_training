package conditionals;

import java.util.*;

public class ClientData {
    public static void main(String[] args) {
        //arrays
        String [] nameStudents = new String[6];
        nameStudents[0] = "enzo";
        nameStudents[1] = "juli";
        nameStudents[2] = "ema";
        nameStudents[3] = "fede";
        nameStudents[4] = "fede";
        nameStudents[5] = "agus";


        //list/vector/stack
        // lo puedo imprimir con el foreach
        List<String> nameStudentsList = new ArrayList<>();
        nameStudentsList.add("pepe");
        nameStudentsList.add("juan");
        nameStudentsList.add("franco");


        Vector <String> nameStudentsVector = new Vector<>();
        nameStudentsVector.add("prueba");
        nameStudentsVector.add("prueba1");
        nameStudentsVector.add("prueba2");

        Stack <String> nameStudentsStack = new Stack<>();
        nameStudentsStack.add("0");
        nameStudentsStack.add("1");
        nameStudentsStack.add("2");

        //map
        Map <String,String> studentsMap = new HashMap<>();
        studentsMap.put("el","Enzo Lagos");
        studentsMap.put("as","Anibal Sissero");
        studentsMap.put("ae","Agustin Errorio");
        System.out.println(Arrays.asList(studentsMap));

    }
}
