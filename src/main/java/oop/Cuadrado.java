package oop;

public class Cuadrado extends Figura{

    private int lado;

    public Cuadrado(int size) {
        super(size);
    }

    @Override
    public void area() {
        System.out.println("Obteniendo area...");
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public void pintar() {
        System.out.println("Pintando el cuadrado...");
    }
}
