package factory.example;

public class Firefox implements IBrowser{
    @Override
    public void create() {
        System.out.println("creando firefox...");
    }
}
