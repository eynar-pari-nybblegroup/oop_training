package singleton;

public class Persona
{
    String name;

    public Persona()
    {
        System.out.println(" persona ");
        System.out.println("*** " + Singleton1.getInstance().hashCode());
        System.out.println(" persona ");
    }
}
