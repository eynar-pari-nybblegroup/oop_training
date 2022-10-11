package builder.structure;

public class Clien {


    public static void main (String []args){


        Pizza pizza= new Pizza();
        pizza.setAdereso("asdasd").setTipoMasa("asdasd").setFruta("asdas").setTipoQueso("asd");
        pizza.setAdereso("asdasd").setTipoMasa("asdasd").setFruta("asdas");
        pizza.setAdereso("asdasd");
        pizza.setAdereso("asdasd").setTipoMasa("asdasd");


        Director chef = new Director();
        chef.pizzaToCreate( new PizzaTradicional());
        chef.buildPizza();

        Pizza p1 = chef.getPizza();

        System.out.println(p1.getAdereso());
        System.out.println(p1.getFruta());
        System.out.println(p1.getTipoQueso());
        System.out.println(p1.getTipoMasa());


    }
}
