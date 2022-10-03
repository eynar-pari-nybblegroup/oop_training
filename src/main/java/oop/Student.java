package oop;

public class Student extends Person{

    private String idStudent;

    public Student(){
        System.out.println("Constructor estudiante");
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public void run(){
        super.run();
        System.out.println("El estudiante esta empezando la carrera");
    }
}
