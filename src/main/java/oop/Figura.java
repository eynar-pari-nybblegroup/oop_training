package oop;

public abstract class Figura {

    private int size;

    public Figura(int size){
        this.size=size;
    }
    public abstract void area();

    public void pintar(){
        System.out.println("Pintando la figura...");
    }
    public void mover(){
        System.out.println("Moviendo la figura...");
    }
}
