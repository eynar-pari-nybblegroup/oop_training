package school;

public class Curso {

    private char nombre_curso;
    private String pizarron;

    public Curso(char nombre_curso, String pizarron) {
        this.nombre_curso = nombre_curso;
        this.pizarron = pizarron;
    }

    public char getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(char nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public String getPizarron() {
        return pizarron;
    }

    public void setPizarron(String pizarron) {
        this.pizarron = pizarron;
    }
}
