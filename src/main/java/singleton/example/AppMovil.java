package singleton.example;

public class AppMovil {
    private String session;
    private Persona persona;

    public AppMovil(String name) {
        this.session = session;
    }

    public void extraerDinero(Persona persona,int dinero){
        // extraer dinero
        System.out.println(" ** App Movil **");
        Banco.getInstance().retirarDinero(dinero);
    }
}
