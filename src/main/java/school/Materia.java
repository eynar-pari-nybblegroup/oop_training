package school;

public class Materia {

    private String nombre_materia;
    private int horas_x_semana;
    private Curso curso;
    private Docente docente;

    public Materia(Alumno alumno) {
        this.nombre_materia = nombre_materia;
        this.horas_x_semana = horas_x_semana;
        this.curso = curso;
        this.docente = docente;
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

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public int getHoras_x_semana() {
        return horas_x_semana;
    }

    public void setHoras_x_semana(int horas_x_semana) {
        this.horas_x_semana = horas_x_semana;
    }
}
