package singleton.structure;

public class Persona {

    String name;

    public Persona(){
        System.out.println(" persona ");
        System.out.println("*** "+Singleton2.getInstance().hashCode());
        System.out.println(" persona ");
    }
}
