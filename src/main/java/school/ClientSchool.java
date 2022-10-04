package school;

public class ClientSchool
{
    public static void main(String[] args)
    {
        Subject matematica = new Subject();
        matematica.setSubjectName("Matematica");
        matematica.setCapacity(10);
        matematica.setCourse(new Course("Torres", 12));

        Teacher docenteA = new Teacher();
        //Teacher.setContractor(true);
        //Teacher.setIdTeacher(1234);
        //Teacher.setName("");
        //Teacher.setLastName("");
        //Teacher.setId("123");
        //Teacher.setAge(30);

        //matematica.setTeacher(docenteA);
        matematica.showSubjectInfo();

        Student e1 = new Student();
        e1.setName("Juan");
        e1.setLastName("Juan");
        //e1.setId("123123");
        e1.setAge(16);
        //e1.setMatricula("E1000");
        e1.setNivel(2);
        //e1.setGrades(); //agregar en la lista las 3
        //e1.setGradesAverage(); //calcular el promedio de notas

        Student e2 = new Student();
        e2.setName("Pedro");
        e2.setLastName("Pedro");
        //e2.setId("123321");
        e2.setAge(17);
        //e2.setMatricula("E1001");
        e2.setNivel(2);
        //e2.setGrades(); //agregar en la lista las 3
        //e2.setGradesAverage(); //calcular el promedio de notas

        //matematica.addEstudiante(e1);
        //matematica.addEstudiante(e1);
        //matematica.getStudent();
        //matematica.showInfoSubject();

    }
}
