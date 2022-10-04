package singleton.structure;

public class Singleton2 {

    // 1ra tener como atributo a la misma clase
    private static final Singleton2 instance = new Singleton2();

    // 2da el constructor tiene que ser privado
    private Singleton2(){
        System.out.println("Instanciando Singleton ....");
    }

    // 3ro tener un metodo estatico publico para acceder a la instancia unica

    public static Singleton2 getInstance(){
        return instance;
    }

    public void getHora(){
        System.out.println("hora.");
    }


}
