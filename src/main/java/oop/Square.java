package oop;

public class Square extends Figure
{
    //attributes
    private int lado;

    public Square(int size)
    {
        super(size);
    }
    public void area()
    {
        System.out.println("obteniendo area");
    }

    //Getters & Setters
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    //Sobreescribir metodo pintar de la clase abstracta
    @Override
    public void pintar()
    {
        System.out.println("Pintando el cuadrado");
    }
}
