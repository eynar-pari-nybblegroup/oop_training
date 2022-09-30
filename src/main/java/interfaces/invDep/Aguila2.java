package interfaces.invDep;

public class Aguila2 implements IAveTerrestre,IAveVolador {


    @Override
    public void caminar() {
        System.out.println("caminar");
    }

    @Override
    public void volar() {
        System.out.println("volar");
    }
}
