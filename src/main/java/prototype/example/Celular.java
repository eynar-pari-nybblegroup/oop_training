package prototype.example;

public class Celular implements IPrototype {

    private String modelo;
    private String marca;
    private String memoria;
    private String almacenamiento;
    private String camaraFront;
    private String camaraPrincipal;
    private String emai;

    public Celular(){}

    @Override
    public String toString() {
        return "Celular{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", memoria='" + memoria + '\'' +
                ", almacenamiento='" + almacenamiento + '\'' +
                ", camaraFront='" + camaraFront + '\'' +
                ", camaraPrincipal='" + camaraPrincipal + '\'' +
                ", emai='" + emai + '\'' +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getCamaraFront() {
        return camaraFront;
    }

    public void setCamaraFront(String camaraFront) {
        this.camaraFront = camaraFront;
    }

    public String getCamaraPrincipal() {
        return camaraPrincipal;
    }

    public void setCamaraPrincipal(String camaraPrincipal) {
        this.camaraPrincipal = camaraPrincipal;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    @Override
    public Object clone() {
        Celular clone = new Celular();
        clone.setAlmacenamiento(this.almacenamiento);
        clone.setCamaraFront(this.camaraFront);
        clone.setCamaraPrincipal(this.camaraPrincipal);
        clone.setEmai(this.emai);
        clone.setMarca(this.marca);
        clone.setMemoria(this.memoria);
        clone.setModelo(this.modelo);
        return clone;
    }
}
