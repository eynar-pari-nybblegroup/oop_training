package factory.example;

public class Chrome implements IBrowser{
    @Override
    public void create() {
        System.out.println("creando Chrome...");
    }
}
