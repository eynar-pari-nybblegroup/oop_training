package relation;

public class Bicicleta {
    private String marca;
    private String size;

    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;

    private Adorno sticker;

    public Bicicleta(){
        ruedaTrasera = new Rueda();
        ruedaDelantera = new Rueda();
    }
    public void agregarAdorno(Adorno sticker){
        this.sticker=sticker;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
