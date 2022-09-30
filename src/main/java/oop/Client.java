package oop;

public class Client {
    public static void main(String [] aj){
        Persona personA = new Persona();
        personA.setName("Julian");

        Persona personB = new Persona();
        personB.setName("Francisco");

        Persona personC = new Persona();
        personB.setName("Juan");

        System.out.println("Persona C: " + personC.getName());
        System.out.println("Persona B: " + personB.getName());
        System.out.println("Persona A: " + personA.getName());

        Student studentA = new Student();
        studentA.run();

        Cuadrado cuadradoA = new Cuadrado(5);

        cuadradoA.pintar();
        cuadradoA.area();
        cuadradoA.mover();
    }
}
