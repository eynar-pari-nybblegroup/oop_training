package oop;

public class Client
{
    public static void main(String[] args)
    {
        //instanciando "personA"
        Person personA = new Person();
        personA.setName("Eynar");

        Person personB = new Person();
        personB.setName("Agustin");

        Person personC = new Person();
        personC.setName("Enzo");

        System.out.println("personA: "+ personA.getName());
        System.out.println("personB: "+ personB.getName());
        System.out.println("personC: "+ personC.getName());

        Student studentA = new Student();

        studentA.run();

        Square cuadradoA = new Square(5);
        cuadradoA.pintar();
        cuadradoA.area();
        cuadradoA.mover();
    }
}
