package advancepractiseday01;

import java.util.Scanner;
public class C02_Varaibles_Hipotennus {
    public static void main(String[] args) {
        //hipottenus hesaplayan kodu yazdırınız
        Scanner input=new Scanner(System.in);
        System.out.println("Birinic dik kenar uzunluğunu giriniz");
        int a=input.nextInt();
        System.out.println("ikinc, dik kenar uzunluğunu giriniz");
        int b= input.nextInt();

        double hipotenus= Math.sqrt(a*a+b*b);
        System.out.println("hipotenus= "+hipotenus);
        System.out.printf("formatlı= " +"%.2f",hipotenus );
    }
}
