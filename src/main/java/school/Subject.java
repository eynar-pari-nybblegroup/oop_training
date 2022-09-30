package school;
import java.util.*;

public class Subject
{
    private String subjectName;
    private int subjectId;
    private String teacher;
    private List<Student> assignedStudents; //debe estar inicializado (no puede haber materias sin alumnos)

    public Subject()
    {
        System.out.println("Constructor Subject");
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
}
