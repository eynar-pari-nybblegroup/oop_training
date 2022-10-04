package school;
import java.util.*;

public class Subject
{
    private String subjectName;
    private int subjectId;
    private String teacher;
    private List<Student> assignedStudents; //debe estar inicializado (no puede haber materias sin alumnos) --> composicion

    // private Map<String, Student> studentMap = new HashMap<>();
    private int capacity;

    public Subject()
    {
        capacity = 30;
    }

    //Getters & Setters

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public List<Student> getAssignedStudents() {
        return assignedStudents;
    }

    public void setAssignedStudents(List<Student> assignedStudents) {
        this.assignedStudents = assignedStudents;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCourse(Course torres) {
    }

//    public void addStudentList(Student estudiante2)
//    {
//        //if preguntar si el estudiante ya existe antes de agregar
//        for (Student estudiante: assignedStudents)
//        {
////            if(estudiante.getMatricula().equals(estudiante2.getMatricula()))
////            {
////                inscription = false;
////            }
////        }
////        if (inscription)
////        {
////            this.assignedStudents.add(estudiante);
////        }
//
//    }

    public void showSubjectInfo()
    {

    }
}
