package ejercicio1;

public class Materia {

    private String name;
    private String careerDictated;
    private int yearDictated;
    private Curso curso;
    private Docente docente;
    private Alumno alumno;

    public Materia(String name, String careerDictated, int yearDictated, Alumno alumno) {
        this.name = name;
        this.careerDictated = careerDictated;
        this.yearDictated = yearDictated;
        this.alumno = alumno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCareerDictated() {
        return careerDictated;
    }

    public void setCareerDictated(String careerDictated) {
        this.careerDictated = careerDictated;
    }

    public int getYearDictated() {
        return yearDictated;
    }

    public void setYearDictated(int yearDictated) {
        this.yearDictated = yearDictated;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
