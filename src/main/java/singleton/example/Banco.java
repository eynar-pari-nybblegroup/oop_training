package singleton.example;

public class Banco
{
    //Aca se usa el singleton
    private static Banco instancia = null;
    private int saldo;

    private Banco()
    {
        saldo = 1000;
        System.out.println("Saldo inicial: "+ saldo);
    }

    public synchronized static void multiThread()
    {
        if(instancia == null)
        {
            instancia = new Banco();
        }
    }

    public static Banco getInstance()
    {
        if(instancia == null)
        {
            multiThread();

        }

        return instancia;
    }

    public synchronized void retirarDinero(int cantidadRetirar)
    {
        if(cantidadRetirar <= this.saldo)
        {
            saldo = saldo-cantidadRetirar;
            System.out.println("DONE > cantidad retirada: " + cantidadRetirar+ ", saldo actual: "+saldo);
        }else
        {
            System.out.println("Error, no se puede retirar esa cantidad:"+ cantidadRetirar+", actualmente su saldo es "+ saldo);
        }
    }
}
