package builder.structure;

public class PizzaHuawaina extends Builder {
    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("Huawaina Queso");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("Huawaina Masa");
    }

    @Override
    public void buildFruta() {
        this.pizza.setFruta("Huawaina");
    }

    @Override
    public void buildAdereso() {
        this.pizza.setAdereso("Huawaina Adereso");
    }
}
