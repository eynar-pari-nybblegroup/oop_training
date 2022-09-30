package oop;

public class Person {
     // attribute
     // encapsulacion
     private String name;
     private String date;
     private String height;
     private String profession;
     private int id;

     // constructor
     public Person(){

     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void run(){
         System.out.println("estoy corriendo ....");
    }
}
