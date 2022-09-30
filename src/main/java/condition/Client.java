package condition;

public class Client {

    public static void main(String[] args) {
        // condicionales if en una sola linia
        //  si un numero A es mayor a un numero B ---> A es mayor B / B es mayor que A

        int a = 50;
        int b = 100;
        String msg = a > b ? "A es mayor B " : "B es mayor o igual que A";
        //System.out.println(msg);

        // if condition
        String msg2;
        if (a > b) {
            msg2 = "1) A es mayor B ";
            System.out.println(msg2);
        }

        if (a > b)
            System.out.println(" 2) **** A es mayor B ");


        // if condition else
        if (a > b) {
            msg2 = "*) A es mayor B ";
            System.out.println(msg2);
        } else {
            msg2 = "*) B es mayor o igual A ";
            System.out.println(msg2);
        }


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
        // switch case
        int number =8;

        switch (number){

            case 1:
                System.out.println("-----el numero es 1");
                break;
            case 2:
                System.out.println("------el numero es 2");
                break;
            case 3:
                System.out.println("------el numero es 3");
                break;
            default:
                System.out.println("---*-**el numero es "+number);
                break;
        }





    }
}
