package prototype.structure;



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
        jose2 = (Persona) jose.clone();

        jose2.setDni("88898888");
        System.out.println("JOSE2 : "+jose2.getDni() );

        System.out.println("JOSE : "+jose.getDni() );

    }

}
