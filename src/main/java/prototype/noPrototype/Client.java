package prototype.noPrototype;

public class Client {

    public static void main(String []args){

        Persona jose = new Persona();
        jose.setDni("123");
        jose.setEdad("22");
        jose.setName("Jose");
        jose.setLastName("Jose");
        jose.setOther("123");
        jose.setProfesion("ingeniero");

        System.out.println("JOSE : "+jose.getDni() );


        Persona jose2;
        jose2 = jose;

        jose2.setDni("88898888");
        System.out.println("JOSE2 : "+jose2.getDni() );
        // esto ocurre cuando no usamos el prototype
        System.out.println("JOSE : "+jose.getDni() );

    }

}
