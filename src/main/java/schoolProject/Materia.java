package schoolProject;

public class Materia {
    private Curso cursoMateria;
    private Estudiante estudiante;
    private Docente docenteMateria;

    public void asignarDocente(Docente docente){
        this.docenteMateria = docente;
    }
    public void asignarCurso(Curso curso){
        this.cursoMateria = curso;
    }




}
