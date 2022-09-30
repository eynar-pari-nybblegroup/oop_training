package ej1;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nombreAula;
    private int asientos;
    private boolean hasPizarron;

    public Curso() {
    }

    public String getNombreAula() {
        return nombreAula;
    }

    public void setNombreAula(String nombreAula) {
        this.nombreAula = nombreAula;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public boolean isHasPizarron() {
        return hasPizarron;
    }

    public void setHasPizarron(boolean hasPizarron) {
        this.hasPizarron = hasPizarron;
    }
}
