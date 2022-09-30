package interfaces;

public class Square implements IFigure
{
    @Override
    public void pintar()
    {
        System.out.println("Pintando");
    }

    @Override
    public void mover()
    {
        System.out.println("Moviendo");
    }

    @Override
    public void area()
    {
        System.out.println("Obteniendo area");
    }
}
