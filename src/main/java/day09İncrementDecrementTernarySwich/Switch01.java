package day09İncrementDecrementTernarySwich;

public class Switch01 {
    public static void main(String[] args) {
       String dayName = "Wednesday";
       switch (dayName){
           case"Sunday":
               System.out.println(1);
               break;
           case"Monday":
               System.out.println(2);
               break;
           case"Tuesday":
               System.out.println(3);
               break;
           case"Wednesday":
               System.out.println(4);
               break;
           case"Thursday":
               System.out.println(5);
               break;
           case"Friday":
               System.out.println(6);
               break;
               case"Saturday":
               System.out.println(7);
               break;
           default:
               System.out.println("Lütfen geçerli bir isim giriniz");
       }


    }
}
