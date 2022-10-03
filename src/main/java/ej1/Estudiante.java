package ej1;

public class Estudiante extends Persona{

    private Nota nota1;
    private Nota nota2;
    private Nota notaF;
    private String numMatricula;
    private int nivel;

    public Estudiante(){}

    public Nota getNota1() {
        return nota1;
    }

    public void setNota1(Nota nota1) {
        this.nota1 = nota1;
    }

    public Nota getNota2() {
        return nota2;
    }

    public void setNota2(Nota nota2) {
        this.nota2 = nota2;
    }

    public Nota getNotaF() {
        return notaF;
    }

    public void setNotaF(Nota notaF) {
        this.notaF = notaF;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void showInfo(){
        System.out.println("****  ESTUDIANTE ****");
        super.showInfo();
        System.out.println("numMatricula: "+numMatricula);
        System.out.println("nivel: "+nivel);
        System.out.println("*** Nota 1 ***" );
        nota1.showInfo();
        System.out.println("*** Nota 2 ***" );
        nota2.showInfo();
        System.out.println("*** Nota Final ***" );
        notaF.showInfo();
    }
}
