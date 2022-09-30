package oop;

public class Student extends Person {

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

    @Override
    public void run()
    {
        super.run(); //Palabra reservada para llamar a metodos de la clase padre
        System.out.println("estudiante esta empezando la carrera.");
    }

}
