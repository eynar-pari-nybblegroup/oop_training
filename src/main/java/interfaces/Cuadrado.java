package interfaces;

public class Cuadrado implements IFigura{
    @Override
    public void pintar() {
        System.out.println("Pintando cuadrado...");
    }

    @Override
    public void mover() {
        System.out.println("Moviendo cuadrado...");
    }

    @Override
    public void area() {
        System.out.println("Obteniendo area cuadrado...");
    }
}
