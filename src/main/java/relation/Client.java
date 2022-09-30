package relation;

public class Client {
    public static void main(String[] args) {
        Bicicleta bicicletaA = new Bicicleta();
        //agragacion
        bicicletaA.agregarAdorno(new Adorno());
    }
}
