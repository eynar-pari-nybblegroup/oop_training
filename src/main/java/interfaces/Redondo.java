package interfaces;

public class Redondo implements IFigura{
    @Override
    public void pintar() {
        System.out.println("pintando redondo");
    }

    @Override
    public void mover() {
        System.out.println("moviendo redondo");
    }

    @Override
    public void area() {
        System.out.println("obteniendo area redondo");
    }
}
