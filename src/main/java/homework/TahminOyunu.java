package homework;

import java.util.Scanner;

public class TahminOyunu {
    public static void main(String[] args) {
        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi tahmininde bulununuz");
        int bet = (int) (Math.random() * 101);

        int sayac=10;
        int sayi;

        do {
            sayac--;
            sayi = sc.nextInt();


            if (sayi==bet){
                System.out.println("Kazandin");
            } else if (sayi<bet) {
                System.out.println("UP UP");
                System.out.println(sayac+" hakkin kaldi");

            } else if (sayi>bet) {
                System.out.println("DOWN DOWN");
                System.out.println(sayac+" hakkin kaldi");

            }else {
                System.out.println("TEBRIKLER!!!" + (10 - sayac) + "tahminde bulundunuz");
                System.out.println("Puaniniz: " + (sayac + 1) * 10);
            }

            if (sayac == 0) {
                System.out.println("Hakkiniz bitti");
                break;
            }

        } while (sayi != bet);
    }
}
