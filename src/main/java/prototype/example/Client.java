package prototype.example;

import java.security.cert.CertPathChecker;

public class Client {

    public static void main (String []asdasdasd){
        Celular celular = new Celular();
        celular.setModelo("S25 ultra");
        celular.setMemoria("500G");
        celular.setMarca("samsung");
        celular.setEmai("S1000001");
        celular.setAlmacenamiento("50G");
        celular.setCamaraPrincipal("10mpx");
        celular.setCamaraFront("50mpx");

        Celular celular1 = (Celular) celular.clone();
        celular1.setEmai("S1000002");
        Celular celular2 = (Celular) celular.clone();
        celular2.setEmai("S1000003");
        Celular celular3 = (Celular) celular.clone();
        celular3.setEmai("S1000004");
        Celular celular4 = (Celular) celular.clone();
        celular4.setEmai("S1000005");
        Celular celular5 = (Celular) celular.clone();
        celular5.setEmai("S1000006");
        Celular celular6 = (Celular) celular.clone();
        celular6.setEmai("S1000007");

        System.out.println("\n C1 \n"+celular.toString());
        System.out.println("\n C2 \n"+celular1.toString());
        System.out.println("\n C3 \n"+celular2.toString());
        System.out.println("\n C4 \n"+celular3.toString());
        System.out.println("\n C5 \n"+celular4.toString());
        System.out.println("\n C6 \n"+celular5.toString());
        System.out.println("\n C7 \n"+celular6.toString());
    }

}
