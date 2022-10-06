package factory.example;

public class Edge implements IBrowser{
    @Override
    public void create() {
        System.out.println("creando Edge...");
    }
}
