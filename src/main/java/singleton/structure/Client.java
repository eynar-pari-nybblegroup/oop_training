package singleton.structure;

public class Client
{
    public static void main(String[] args)
    {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton1 a1= Singleton1.getInstance();
                System.out.println("hilo1 - singleton 1: "+ a1.hashCode());
            }
        }) ;

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton1 a2= Singleton1.getInstance();
                System.out.println("hilo2 - singleton 1: "+ a2.hashCode());
            }
        }) ;


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton1 a3= Singleton1.getInstance();
                System.out.println("hilo3 - singleton 1: "+ a3.hashCode());
            }
        }) ;


        thread1.start();
        thread2.start();
        thread3.start();


    }
}
