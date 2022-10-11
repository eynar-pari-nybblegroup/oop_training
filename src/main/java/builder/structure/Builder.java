package builder.structure;

public abstract class Builder {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createPizza() {
        this.pizza = new Pizza();
    }

    public abstract void buildTipoQueso();
    public abstract void buildTipoMasa();
    public abstract void buildFruta();
    public abstract void buildAdereso();
}
