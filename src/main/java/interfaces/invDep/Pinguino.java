package interfaces.invDep;

public class Pinguino implements IAve{
    @Override
    public void nadar() {
        System.out.println("nadar");
    }

    @Override
    public void volar() {

    }

    @Override
    public void caminar() {
        System.out.println("caminar");
    }
}
