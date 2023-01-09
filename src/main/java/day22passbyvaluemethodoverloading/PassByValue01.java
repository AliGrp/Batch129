package day22passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        /*
  1) Java "pass-by-value" sayesinde variable'larin orjinal degerlerini koruma altina alir.
 */
        double shirt = 100;

       double seniorShirtPrice = discount("senior",shirt);
       double studentShirtPrice =  discount("student",shirt);
       double veterantShirtPrice =  discount("veteran",shirt);

        System.out.println(shirt);

        System.out.println("studentShirtPrice = " + studentShirtPrice);
        System.out.println("veterantShirtPrice = " + veterantShirtPrice);
        System.out.println("seniorShirtPrice = " + seniorShirtPrice);

        shirt = discount("veteran",shirt);
        System.out.println(shirt);
    }

    public static double discount(String state, double price) {

        switch (state){

            case "student":
                price = price*0.90;
                break;

            case "veteran":
                price = price*0.80;
                break;

            case "senior":
                price = price*0.95;
                break;

            default:
                price = price;

        }
            return price;
    }
}