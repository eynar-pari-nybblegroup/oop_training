package ej1;

public class Docente extends Persona{
    private boolean isContractor;
    private int idDocente;

    public Docente(){}

    public boolean isContractor() {
        return isContractor;
    }

    public void setContractor(boolean contractor) {
        isContractor = contractor;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    @Override
    public void showInfo(){
        System.out.println("****  DOCENTE ****");
        super.showInfo();
        System.out.println("is Contractor?: "+isContractor);
        System.out.println("id Docente: "+idDocente);
    }
}
