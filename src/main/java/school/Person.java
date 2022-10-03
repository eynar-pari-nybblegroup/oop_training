package school;

import java.util.*;

public class Person
{
    private String name;
    private String lastName;
    private int id;
    private int age;
    //fecha de nacimiento

    public Person()
    {
        System.out.println("Constructor Person");
    }

    //Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo()
    {
        System.out.println("name:" +name+"\n"+"Last name:"+lastName+"\n"+"id:"+id+"age:"+age);
    }
}
