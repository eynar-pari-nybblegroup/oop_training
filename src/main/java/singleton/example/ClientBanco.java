package singleton.example;

import singleton.structure.Singleton1;

public class ClientBanco
{
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
               AppMovil appMovil = new AppMovil("BM");
               appMovil.extraerDinero(new Persona("Jose", "1231231"), 100);
            }
        }) ;

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero cajero = new Cajero("Av54");
                cajero.extraerDinero(new Persona("Jose","123123"), 200);

            }
        }) ;


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Sucursal sucursal = new Sucursal("S1");
                sucursal.extraerDinero(new Persona("Jose","123123"), 250);

            }
        }) ;


        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(5000);
        System.out.println("***********************");
        Banco.getInstance().retirarDinero(0);


    }
}
