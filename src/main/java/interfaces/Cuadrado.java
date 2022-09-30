package interfaces;

public class Cuadrado implements IFigura{
    @Override
    public void pintar() {
        System.out.println("pintando");
    }

    @Override
    public void mover() {
        System.out.println("moviendo");
    }

    @Override
    public void area() {
        System.out.println("obteniendo area");
    }
}
