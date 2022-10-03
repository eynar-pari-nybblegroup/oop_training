package condition;

import interfaces.Cuadrado;
import interfaces.IFigura;
import interfaces.Redondo;

public class Client {

    public static void main(String[] args) {

        //Condicionales IF en una sola linea
        int a=50;
        int b=10;
        String msg = a > b ? "A es mayor":"B es mayor o igual que A";
        System.out.println(msg);

        // IF condition

        String msg2;

        if(a > b){
            msg2 = "*) A es mayor que B";
            System.out.println(msg2);
        } else {
            msg2 = "*) B es mayor o igual a A";
            System.out.println(msg2);
        }

        if (a > b){
            System.out.println("2) **** A es mayor B");
        }

        // SWITCH CASE
        int number = 2;

        switch (number){
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            case 3:
                System.out.println("El numero es 3");
                break;
            default:
                System.out.println("El numero es: "+number);
                break;
        }
    }

}
