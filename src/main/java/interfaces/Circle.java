package interfaces;

public class Circle implements IFigure
{
    @Override
    public void pintar()
    {
        System.out.println("Pintando circulo");
    }

    @Override
    public void mover()
    {
        System.out.println("Moviendo circulo");
    }

    @Override
    public void area()
    {
        System.out.println("Obteniendo area circulo");
    }
}
