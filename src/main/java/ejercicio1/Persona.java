package ejercicio1;

public class Persona {

    private String name;
    private String surname;
    private String gender;
    private int dni;

    public Persona(String name, String surname, String gender, int dni) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
