package singleton.example;

public class Cajero
{
    private String alias;
    private Persona persona;

    public Cajero(String alias) {
        this.alias = alias;
    }

    public void extraerDinero(Persona persona, int dinero)
    {
        //extaer dinero logica -- llama singleton
        //logica p/ validar la cuenta de la persona
        System.out.println("*** Cajero: ***");
        Banco.getInstance().retirarDinero(dinero);
    }
}
