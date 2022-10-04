package singleton.structure;

public class Singleton3 {

    // 1ra tener como atributo a la misma clase
    private static Singleton3 instance = null;

    // 2da el constructor tiene que ser privado
    private Singleton3(){
        System.out.println("Instanciando Singleton ....");
    }


    public synchronized static void multiThread (){
        if (instance == null)
            instance= new Singleton3();
    }



    // 3ro tener un metodo estatico publico para acceder a la instancia unica
    public static Singleton3 getInstance(){
        if (instance == null)
            multiThread ();

        return instance;
    }

    public void getHora(){
        System.out.println("hora.");
    }


}
