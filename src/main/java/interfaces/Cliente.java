package interfaces;

public class Cliente {
    public static void main(String[] args) {
        IFigura cuadrado = new Cuadrado();
        IFigura redondo = new Redondo();

        cuadrado.area();
        cuadrado.mover();
        cuadrado.pintar();

        redondo.pintar();
        redondo.area();
        redondo.mover();
    }
}
