package interfaces.invDep;

public class Aguila implements IAve{
    @Override
    public void nadar() {

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
