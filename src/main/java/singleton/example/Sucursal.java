package singleton.example;

public class Sucursal {
    private String name;
    private Persona persona;

    public Sucursal(String name) {
        this.name = name;
    }

    public void extraerDinero(Persona persona,int dinero){
        // extraer dinero
        System.out.println(" ** Sucursal **");
        Banco.getInstance().retirarDinero(dinero);
    }
}
