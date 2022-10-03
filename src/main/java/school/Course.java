package school;
import java.util.*;

public class Course
{
    private int courseId;
    private Teacher assignedTeacher;
    private List<Student> studentsList;
    private List<Subject> assignedSubjects; // no necesita estar inicializado?
    private boolean hasProjector;
    private boolean hasComputer;
    private int sitsNumber;

    public Course(String courseId, int sitsNumber)
    {

    }

    //Getters & Setters
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Teacher getAssignedTeacher() {
        return assignedTeacher;
    }

    public void setAssignedTeacher(Teacher assignedTeacher) {
        this.assignedTeacher = assignedTeacher;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public List<Subject> getAssignedSubjects() {
        return assignedSubjects;
    }

    public void setAssignedSubjects(List<Subject> assignedSubjects) {
        this.assignedSubjects = assignedSubjects;
    }
}
