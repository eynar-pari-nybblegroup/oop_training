package ejercicio1;

public class Docente extends Persona{

    private String address;
    private String profession;
    private String email;
    private int phoneNumber;

    public Docente(String name, String surname, String gender, int dni, String address, String profession, String email, int phoneNumber) {
        super(name, surname, gender, dni);
        this.address = address;
        this.profession = profession;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
