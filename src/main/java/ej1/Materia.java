package ej1;

import java.util.HashMap;
import java.util.Map;

public class Materia {
    private String nameMateria;
    private int capacidad;
    private Docente docente;
    private Curso curso;
    private Map<String, Estudiante> estudianteMap = new HashMap<>();

    public Materia(){
        capacidad=30;
    }


    public void setNameMateria(String nameMateria) {
        this.nameMateria = nameMateria;
    }
    public String getNameMateria() {
        return nameMateria;
    }
    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Estudiante getEstudiante(String numMatricula) {
        return this.estudianteMap.containsKey(numMatricula)?this.estudianteMap.get(numMatricula):null;
    }

    public void addEstudiante(Estudiante estudiante) {
        this.estudianteMap.put(estudiante.getNumMatricula(),estudiante);
    }


    public void showInfoMateria(){

        System.out.println("name materia: "+nameMateria);
        System.out.println("capacidad materia: "+capacidad);
        docente.showInfo();
        curso.showInfo();
        for ( String numMatricula:estudianteMap.keySet()) {
            estudianteMap.get(numMatricula).showInfo();
        }

    }


}
