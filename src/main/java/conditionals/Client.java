package conditionals;

public class Client {
    public static void main(String[] args) {
        //if una sola linea
        int a = 5;
        int b = 6;
        String answer = a > b ? "A es mayor" : "B es mayor";
        System.out.println(answer);

        //if anidados
        int c = 22;
        int d = 22;
        if (c>d){
            String answer2 = "c es mayor que d";
            System.out.println(answer2);
        } else if (d>c){
            String answer3 = "d es mayor que c";
            System.out.println(answer3);
        } else {
            String answer4 = "c y d son iguales";
            System.out.println(answer4);
        }

        //switch
        int number = 8;
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
