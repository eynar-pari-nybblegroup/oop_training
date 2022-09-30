package condition;

public class Client
{
    public static void main(String[] args)
    {
        System.out.println("Conditionals (if):");
        int a =50;
        int b = 100;
        String msg = a > b ? "1) A es mayor a B" : "1) B es mayor o igual que a";
        //String msg = a > b ? "A es mayor a B" : a == b: "B es mayor o igual que a";
        System.out.println(msg);
        String msg2;
        if(a > b)
        {
            msg2= "2) A es mayor que B";
            System.out.println(msg2);
        }

        if(a > b) // si no hay llaves para el if solo toma la siguiente linea como accion de la condicion
            System.out.println("3) A es mayor que B");

        if(a > b)
        {
            msg2= "3.1) A es mayor que B";
            System.out.println(msg2);
        }else
        {
            msg2 = "*) B es mayor que a";
            System.out.println(msg2);
        }

        //if else if
        if (a > b) {
            msg2 = "*) A es mayor B ";
            System.out.println(msg2);
        } else if (a == b){
            msg2 = "*) a y b son iguales ";
            System.out.println(msg2);
        } else if (a % 2 == 0){

            msg2 = "*) a es numero par ";
            System.out.println(msg2);
        } else {
            System.out.println("something");
        }

        // Switch case
        System.out.println("Switch Case:");
        int number = 8;
        switch (number)
        {
            case 1:
                System.out.println("el numero es 1");
                break;
            case 2:
                System.out.println("el numero es 2");
                break;
            case 3:
                System.out.println("el numero es 3");
                break;
            default:
                System.out.println("-*-**el numero es: " + number);


        }

    }
}
