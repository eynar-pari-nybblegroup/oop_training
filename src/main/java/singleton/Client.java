package singleton;

public class Client
{
    public static void main(String[] args)
    {

        new Persona();

        Singleton1 a =Singleton1.getInstance();
        System.out.println("memory A: "+a.hashCode());
        Singleton1.getInstance().getHora();
        Singleton1.getInstance().getHora();


        Singleton1.getInstance().getHora();
        Singleton1.getInstance().getHora();
        Singleton1 b =Singleton1.getInstance();
        System.out.println("memory B: "+b.hashCode());
        Singleton1.getInstance().getHora();
        Singleton1.getInstance().getHora();
        Singleton1.getInstance().getHora();
        System.out.println("memory Objeto: "+Singleton1.getInstance().hashCode());
    }
}
