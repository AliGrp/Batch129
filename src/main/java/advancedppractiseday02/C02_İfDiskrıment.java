package advancedppractiseday02;

import java.util.Scanner;

public class C02_İfDiskrıment {
    public static void main(String[] args) {
        /* katsayıları verilen 1 bilinmeyenli denklemin köklerini bulunuz

        ax² + bx + c;

        çözüm adımları
        kullanıcıdan a.b.c yi alın
        Diskrimant formülü: (-b +/- karekök(delta)/(2a)
        Delta = b² - 4ac
        Delta> 0=> 2 tane kök vardır x1=(-b+kök(delta))/(2*a)
        Delta= 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yktur
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen denklemin a, b, ve c katsayılarını giriniz");
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();

        double delta = b*b-4*a*c;

        if (delta>0){
            double x1 =(-b + Math.sqrt(delta)) / (2 * a);
            double x2 =(-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("denklemin iki kökü vardır: x1= "+x1+", x2="+x2);

        } else if (delta==0) {
            double x = -b/(2 * a);
            System.out.println("denklemin iki kökü vardır: x="+x);

        }else{
            System.out.println("Denlemin kökü yoktur");
        }



    }
}
