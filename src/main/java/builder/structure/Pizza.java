package builder.structure;

public class Pizza {
    String tipoQueso;
    String tipoMasa;
    String fruta;
    String adereso;

    public Pizza(){}

    public String getTipoQueso() {
        return tipoQueso;
    }

    // los seteo de datos devuelven el mismo tipo de la clase
    public Pizza setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public Pizza setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
        return this;
    }

    public String getFruta() {
        return fruta;
    }

    public Pizza setFruta(String fruta) {
        this.fruta = fruta;
        return this;
    }

    public String getAdereso() {
        return adereso;
    }

    public Pizza setAdereso(String adereso) {
        this.adereso = adereso;
        return this;
    }
}
