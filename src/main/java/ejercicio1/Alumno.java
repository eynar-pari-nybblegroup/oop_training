package ejercicio1;

public class Alumno extends Persona implements IAlumno{

    private String career;
    private Nota firstGrade;
    private Nota secondGrade;
    private Nota finalGrade;

    public Alumno(String name, String surname, String gender, int dni, String career) {
        super(name, surname, gender, dni);
        this.career = career;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public Nota getFirstGrade() {
        return firstGrade;
    }

    public void setFirstGrade(Nota firstGrade) {
        this.firstGrade = firstGrade;
    }

    public Nota getSecondGrade() {
        return secondGrade;
    }

    public void setSecondGrade(Nota secondGrade) {
        this.secondGrade = secondGrade;
    }

    public Nota getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Nota finalGrade) {
        this.finalGrade = finalGrade;
    }
}
