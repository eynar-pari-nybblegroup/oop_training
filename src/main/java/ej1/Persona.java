package ej1;

public class Persona {
    private String name;
    private String lastName;
    private String id;
    private String birthDay;

    public Persona(){}

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }


    public void showInfo(){
        System.out.println("name: "+name);
        System.out.println("lastName: "+lastName);
        System.out.println("id: "+id);
        System.out.println("birthDay:"+birthDay);
    }
}
