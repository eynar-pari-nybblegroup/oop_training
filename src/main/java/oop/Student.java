package oop;

public class Student extends Persona{
    private String idStudent;
    public Student(){
        System.out.println("constructor estudiante");
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public void run(){
        super.run();
        System.out.println("Estudiante esta emopezando la carrera");
    }
}
