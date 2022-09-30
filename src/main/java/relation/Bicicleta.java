package relation;

public class Bicicleta {
    private String marca;
    private String size;
    //composicion
    private Rueda ruedaDelantera; // = new Rueda(); tambien se puede instanciar aca
    private Rueda ruedaTrasera; // = new Rueda();
    //agregacion
    private Adorno sticker;

    public Bicicleta(){
        //obligando a que se cree la instancia
         ruedaDelantera = new Rueda();
         ruedaTrasera = new Rueda();
    }
    public void agregarAdorno(Adorno sticker){
        this.sticker = sticker;
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
