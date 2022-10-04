package singleton.example;

public class AppMovil
{
    private String session;
    private Persona persona;

    public AppMovil(String session)
    {
        this.session = session;
    }

    public void extraerDinero(Persona persona, int dinero)
    {
        //extaer dinero logica -- llama singleton
        System.out.println("*** App movil: ***");
        Banco.getInstance().retirarDinero(dinero);
    }
}
