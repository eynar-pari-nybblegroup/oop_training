package oop;

public class Client {

    public static void main (String[]args){
        Person personA = new Person();
        personA.setName("Eynar");

        Person personB = new Person();
        personB.setName("Agustin");

        Person personC = new Person();
        personC.setName("Enzo");

        System.out.println("person A: "+personA.getName());
        System.out.println("person B: "+personB.getName());
        System.out.println("person C: "+personC.getName());

        Student studentA = new Student();
        studentA.run();


        Cuadrado cuadradoA = new Cuadrado(5);
        cuadradoA.pintar();
        cuadradoA.area();
        cuadradoA.mover();

    }

}
