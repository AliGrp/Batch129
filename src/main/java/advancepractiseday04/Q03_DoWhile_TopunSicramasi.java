package advancepractiseday04;

import java.util.Scanner;

public class Q03_DoWhile_TopunSicramasi {
    public static void main(String[] args) {
        /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Birakilan yuksekligi giriniz");
        double high = input.nextDouble();
        double sicramaSayisi=0;
        double toplamYol=0;


        do {
            sicramaSayisi++;
            toplamYol+=high;
            high = high*0.75;
            toplamYol+=high;



        }while (high>=1);
        System.out.printf("toplamYol = " +"%.2f", toplamYol);
        System.out.println();
        System.out.println("counter = " + sicramaSayisi);
    }
}
