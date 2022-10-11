package builder.structure;

public class Director {
    private Builder builder;

    public Pizza getPizza(){
        return builder.pizza;
    }

    public void pizzaToCreate(Builder builder){
        this.builder = builder;
    }

    public void buildPizza(){
        this.builder.createPizza();
        this.builder.buildAdereso();
        this.builder.buildFruta();
        this.builder.buildTipoMasa();
        this.builder.buildTipoQueso();
    }

}
