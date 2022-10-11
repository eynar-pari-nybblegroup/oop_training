package builder.noBuilder;

public class Pizza {

    String tipoQueso;
    String tipoMasa;
    String fruta;
    String adereso;


    public Pizza (){
        // tradicional
        tipoMasa="normal";
        tipoQueso="mozarella";
        fruta="no";
        adereso="jamon/oregano";
    }

    public void PizzaHawaina (){
        // hawaina
        tipoMasa="normal";
        tipoQueso="mozarella";
        fruta="cereza/pina";
        adereso="jamon/oregano";
    }

    public Pizza(String tipoMasa){
        this.tipoMasa=tipoMasa;
    }

    public Pizza(String tipoMasa,String tipoQueso){
        this.tipoMasa=tipoMasa;
        this.tipoQueso=tipoQueso;
    }

    public Pizza(String tipoMasa,String tipoQueso,String fruta){
        this.tipoMasa=tipoMasa;
        this.tipoQueso=tipoQueso;
        this.fruta=fruta;
    }

    public Pizza(String tipoMasa,String tipoQueso,String fruta,String adereso){
        this.tipoMasa=tipoMasa;
        this.tipoQueso=tipoQueso;
        this.fruta=fruta;
        this.adereso=adereso;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public String getAdereso() {
        return adereso;
    }

    public void setAdereso(String adereso) {
        this.adereso = adereso;
    }
}
