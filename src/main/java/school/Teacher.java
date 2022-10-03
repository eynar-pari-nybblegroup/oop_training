package school;

import javax.sound.midi.MidiDevice;
import java.util.*;

public class Teacher extends Person
{
    private List<Course> assignedCourses; // Es necesario que el docente tenga cursos?
    private List<Subject> assignedSubjects; // no necesita estar inicializado?
    private float hours;
    private float salary;
    private boolean isContractor;
    private int idTeacher;

    public Teacher()
    {
        System.out.println("Constructor Teacher");
    }

    //Getters & Setters

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }

    public void setAssignedCourses(List<Course> assignedCourses) {
        this.assignedCourses = assignedCourses;
    }

    public List<Subject> getAssignedSubjects() {
        return assignedSubjects;
    }

    public void setAssignedSubjects(List<Subject> assignedSubjects) {
        this.assignedSubjects = assignedSubjects;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isContrator() {
        return isContrator;
    }

    public void setContractor(boolean contrator) {
        isContrator = contrator;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Override
    public void showInfo()
    {
        System.out.println("****** TEACHER ******");
        super.showInfo();
        System.out.println("is contractor?:" + isContrator);
        System.out.println("Id Docente:"+ idTeacher);
    }
}
