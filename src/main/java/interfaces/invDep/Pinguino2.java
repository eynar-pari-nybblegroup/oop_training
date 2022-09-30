package interfaces.invDep;

public class Pinguino2 implements IAveTerrestre,IAveAcuatica {
    @Override
    public void nadar() {
        System.out.println("nadar");
    }

    @Override
    public void caminar() {
        System.out.println("caminar");
    }

}
