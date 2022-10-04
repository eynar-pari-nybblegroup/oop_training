package singleton.example;

public class Cajero {
    private String alias;
    private Persona persona;

    public Cajero(String alias) {
        this.alias = alias;
    }

    public void extraerDinero(Persona persona,int dinero){
        // validar la cuenta persona
        System.out.println(" ** Cajero **");
        Banco.getInstance().retirarDinero(dinero);
    }
}
