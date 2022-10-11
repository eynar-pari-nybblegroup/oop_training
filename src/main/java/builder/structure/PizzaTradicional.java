package builder.structure;

public class PizzaTradicional extends Builder {
    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("Tradicional Queso");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("Tradicional Masa");
    }

    @Override
    public void buildFruta() {
        this.pizza.setFruta("NO");
    }

    @Override
    public void buildAdereso() {
        this.pizza.setAdereso("Tradicional Adereso");
    }
}
