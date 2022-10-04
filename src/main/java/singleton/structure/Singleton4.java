package singleton.structure;

public class Singleton4 implements Cloneable {

    // 1ra tener como atributo a la misma clase
    private static Singleton4 instance = null;

    // 2da el constructor tiene que ser privado
    private Singleton4(){
        System.out.println("Instanciando Singleton ....");
    }

    // 3ro tener un metodo estatico publico para acceder a la instancia unica

    public static Singleton4 getInstance(){
        if (instance == null)
            instance= new Singleton4();

        return instance;
    }

    public void getHora(){
        System.out.println("hora.");
    }

    public void restartSingleton(){
        instance=null;
    }

    @Override
    public Object clone(){
        throw new RuntimeException("No esta permitido el clon del singleton");
    }

}
