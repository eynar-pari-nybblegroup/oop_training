package oop;

import java.util.Date;

public class Persona {

    //encapsulacion
    //atributos
    private String name;
    private int id;
    private String date;
    private String height;
    private String profession;

    //constructor
    public Persona()
    {

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getHeight() {
        return height;
    }

    public String getProfession() {
        return profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void run(){
        System.out.println("Estoy corriendo...");
    }
}
