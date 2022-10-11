package builder.noBuilder;

public class Client {


    public static void main (String[]args){


        Pizza pizza = new Pizza() ; // tradicional

        pizza.setAdereso("asd");
        pizza.setFruta("asd");
        pizza.setTipoQueso("asd");
        pizza.setTipoMasa("asd");

        pizza.PizzaHawaina();


        Pizza pizza1 = new Pizza("xxxx");
        Pizza pizza2 = new Pizza("xxxx","qqqqq");
        Pizza pizza3 = new Pizza("xxxx","qqqqq","asd");
        Pizza pizza4 = new Pizza("xxxx","qqqqq","asda","asdasd");

    }







}
