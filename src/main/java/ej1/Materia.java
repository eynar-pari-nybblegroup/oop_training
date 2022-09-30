package ej1;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private Integer anoMateria;
    private Docente docente;
    private Curso curso;
    private List<Alumno> alumnos;

    public Materia() {
        alumnos = new ArrayList<>();
    }





    public int getAnoMateria() {
        return anoMateria;
    }

    public void setAnoMateria(int anoMateria) {
        this.anoMateria = anoMateria;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
