package conditions;

public class Client {
    public static void main(String[] args) {

        //if
        int a=50;
        int b=10;
        String msg=a > b ? "A es mayor ": "B es mayor o igual que A";
        System.out.println(msg);

        //if condition
        String msg2;
        if (a>b){
            msg2 = "A es mayor ";
            System.out.println(msg2);
        } else if (a==b) {
            msg2 = "A es igual a B ";
            System.out.println(msg2);
        } else {
            msg2 = "B es mayor ";
            System.out.println(msg2);
        }

        //switch case

        int number=8;
        switch (number){

            case 1:
                System.out.println("Numero 1");
                break;
            case 2:
                System.out.println("Numero 2");
                break;
            case 3:
                System.out.println("Numero 3");
                break;
            default:
                System.out.println("****otro numero ");
                break;
        }
    }
}
