package school;

import java.util.*;

public class Student extends Person
{
    private List<Grade> grades;
    private Course assignedCourse;
    private List<Subject> assignedSubjects; // relacion necesaria
    private float gradesAverage;
    private Date InscriptionDate;

    public Student()
    {
        System.out.println("Constructor Student");
    }

    //Getters & Setters

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public Course getAssignedCourse() {
        return assignedCourse;
    }

    public void setAssignedCourse(Course assignedCourse) {
        this.assignedCourse = assignedCourse;
    }

    public List<Subject> getAssignedSubjects() {
        return assignedSubjects;
    }

    public void setAssignedSubjects(List<Subject> assignedSubjects) {
        this.assignedSubjects = assignedSubjects;
    }

    public float getGradesAverage() {
        return gradesAverage;
    }

    public void setGradesAverage(float gradesAverage) {
        this.gradesAverage = gradesAverage;
    }

    public Date getInscriptionDate() {
        return InscriptionDate;
    }

    public void setInscriptionDate(Date inscriptionDate) {
        InscriptionDate = inscriptionDate;
    }
}
