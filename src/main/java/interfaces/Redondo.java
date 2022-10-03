package interfaces;

public class Redondo implements IFigura{

    @Override
    public void pintar() {
        System.out.println("Pintando redondo..");
    }

    @Override
    public void mover() {
        System.out.println("Moviendo redondo..");
    }

    @Override
    public void area() {
        System.out.println("Obteniendo area del redondo..");
    }
}
