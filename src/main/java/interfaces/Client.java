package interfaces;

public class Client {
    public static void main(String[] args) {
        IFigura cuadrado = new Cuadrado();
        IFigura redondo = new Redondo();

        cuadrado.area();
        cuadrado.mover();
        cuadrado.pintar();

        redondo.area();
        redondo.mover();
        redondo.pintar();
    }
}
