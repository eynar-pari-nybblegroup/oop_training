package interfaces.invDep;

public class Pato2 implements IAveTerrestre,IAveVolador,IAveAcuatica {
    @Override
    public void nadar() {
        System.out.println("nadar");
    }

    @Override
    public void caminar() {
        System.out.println("caminar");
    }

    @Override
    public void volar() {
        System.out.println("volar");
    }
}
