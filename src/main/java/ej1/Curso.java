package ej1;

public class Curso {
    private String name;
    private int   numAsientos;
    private boolean hasProjector=false;
    private boolean hasComputer=false;

    public Curso(String name, int numAsientos){
        this.name=name;
        this.numAsientos= numAsientos;
    }

    public Curso(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public boolean isHasProjector() {
        return hasProjector;
    }

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }

    public boolean isHasComputer() {
        return hasComputer;
    }

    public void setHasComputer(boolean hasComputer) {
        this.hasComputer = hasComputer;
    }

    public void showInfo(){
        System.out.println("name curso: "+name);
        System.out.println("numAsientos: "+numAsientos);
        System.out.println("has Projector?: "+hasProjector);
        System.out.println("hasComputer? "+hasComputer);
     }

}
