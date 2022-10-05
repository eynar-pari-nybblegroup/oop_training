package prototype.structure;

public class Persona implements IPrototype {
    private String name;
    private String edad;
    private String lastName;
    private String dni;
    private String profesion;
    private String other;


    public Persona(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public Object clone() {
        Persona clone = new Persona();
        clone.setDni(this.getDni());
        clone.setEdad(this.getEdad());
        clone.setLastName(this.getLastName());
        clone.setOther(this.getOther());
        clone.setProfesion(this.getProfesion());
        clone.setName(this.getName());
        return clone;
    }
}
