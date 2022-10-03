package singleton;

public class Singleton1
{
    //1ra tener como atributo a la misma clase
    private static Singleton1 instance = null;

    //2da el constructor tiene que ser privado
    private Singleton1()
    {
        System.out.println("instanciando singleton.");
    }

    //3ero tener un metodo static publico para acceder a la instancia unica
    public static Singleton1 getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton1();
        }
        return instance;
    }

    public void getHora()
    {
        System.out.println("hora.");
    }
}
