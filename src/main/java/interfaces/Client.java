package interfaces;

public class Client
{
    public static void main(String[] args)
    {
        //Se pueden utilizar clases específicas para instanciar una clase padre
        //(Principio SOLID)
        IFigure square = new Square();
        IFigure circle = new Circle();

        square.area();
        square.mover();
        square.pintar();

        circle.area();
        circle.mover();
        circle.pintar();

    }

}
