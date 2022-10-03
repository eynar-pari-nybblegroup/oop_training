package school;

import java.util.*;

public class Student extends Person
{
    private List<Grade> grades;
    private Course assignedCourse;
    private List<Subject> assignedSubjects; // relacion necesaria
    private float gradesAverage;
    private Date inscriptionDate;
    private int matricula;
    private int nivel;

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
        return inscriptionDate;
    }

    public void setInscriptionDate(Date inscriptionDate) {
        inscriptionDate = inscriptionDate;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void showInfo()
    {
        System.out.println("****** STUDENT ******");
        super.showInfo();
        System.out.println("Matricula:"+matricula+"nivel"+nivel);
        //imprimir lista de notas
    }
}
