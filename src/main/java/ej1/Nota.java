package ej1;

public class Nota {

    private int amount;
    private String description;

    public Nota(){}

    public Nota(int amount, String description){
        this.amount=amount;
        this.description=description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void showInfo(){
        System.out.println("amount: "+amount);
        System.out.println("description: "+description);
    }
}
