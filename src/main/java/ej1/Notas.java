package ej1;

public class Notas {
    private int nota1P;
    private int nota2P;
    private int notaPF;

    public Notas() {

    }
    public int notaPromedio(){
        return (nota1P+nota2P+notaPF)/3;
    }
    public int getNota1P() {
        return nota1P;
    }

    public void setNota1P(int nota1P) {
        this.nota1P = nota1P;
    }

    public int getNota2P() {
        return nota2P;
    }

    public void setNota2P(int nota2P) {
        this.nota2P = nota2P;
    }

    public int getNotaPF() {
        return notaPF;
    }

    public void setNotaPF(int notaPF) {
        this.notaPF = notaPF;
    }
}
