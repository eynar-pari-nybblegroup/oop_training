package oop;

public abstract class Figura {
    private int size;
    public Figura(int size){
        this.size = size;
    }
    public abstract void area();
    public void pintar(){
        System.out.println("pintando la figura");
    }
    public void mover(){
        System.out.println("moviendo la figura");
    }

}
