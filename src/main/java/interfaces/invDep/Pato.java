package interfaces.invDep;

public class Pato implements IAve{
    @Override
    public void nadar() {
        System.out.println("nadando");
    }

    @Override
    public void volar() {
        System.out.println("volar");
    }

    @Override
    public void caminar() {
        System.out.println("caminar");
    }
}
