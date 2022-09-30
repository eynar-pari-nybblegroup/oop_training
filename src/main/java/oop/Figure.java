package oop;

public abstract class Figure
{
    private int size;

    public Figure (int size)
    {

        this.size = size;
    }

    //metodo abstract --> no va a tener logica y no esta permitida en clases no abstrctas
    //son los metodos a implementar en clases hijas
    public abstract void area();

    public void pintar()
    {
        System.out.println("pintando la figura");
    }

    public void mover()
    {
        System.out.println("moviendo la figura");
    }
}
