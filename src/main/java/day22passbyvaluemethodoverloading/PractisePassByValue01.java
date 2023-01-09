package day22passbyvaluemethodoverloading;

public class PractisePassByValue01 {
    public static void main(String[] args) {

         double skirt=100;

         double seniorSkirtPrice= discount("senior",skirt);
        System.out.println("seniorSkirtPrice = " + seniorSkirtPrice);

        double veteranSkirtPrice=discount("veteran",skirt);
        System.out.println("veteranSkirtPrice = " + veteranSkirtPrice);

    }

    public static double discount(String state, double price){

        switch (state){
            case "student":
                price = price*0.90;
                break;

            case "veteran":
                price=price*0.80;
                break;

            case "senior":
                price = price*0.85;
                break;

            default:
                price = price;

        }
        return price;
    }

}
