package singleton.example;

import singleton.structure.Singleton3;

public class Banco {
    private static Banco instancia =null;
    private int saldo;

    private Banco(){
        saldo=1000;
        System.out.println(">>> mi saldo inicial es: "+saldo);
    }

    public synchronized static void multiThread (){
        if (instancia == null)
            instancia= new Banco();
    }


    public static Banco getInstance(){
        if (instancia == null)
            multiThread();
        return instancia;
    }

    public synchronized void retirarDinero(int cantidadRetirar){

        if (cantidadRetirar <= this.saldo){
            saldo=saldo-cantidadRetirar;
            System.out.println("DONE > cantidad retirada:"+cantidadRetirar+", saldo Actual: "+saldo);
        }else{
            System.out.println("ERROR> no puede retirar esa cantidad: "+cantidadRetirar+", actualmente su saldo es: "+saldo);
        }
    }

}
