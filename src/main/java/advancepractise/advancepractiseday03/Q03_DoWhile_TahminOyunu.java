package advancepractise.advancepractiseday03;

import java.util.Scanner;

public class Q03_DoWhile_TahminOyunu {
    public static void main(String[] args) {
        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?

        Scanner input = new Scanner(System.in);
        int rastgelleSayi = (int) (Math.random() * 101);
        //System.out.println("0-100 arası(dahil) bir tamsayı giriniz");
        //int sayi= input.nextInt();
        int sayi;
        int sayac = 10;
        System.out.println("0-100 arasi(dahil) bir tam sayi giriniz ");


        do {
            sayac--;
            sayi = input.nextInt();
            if (sayi < rastgelleSayi) {
                System.out.println("Dahah buyuk bir sayi giriniz");
                System.out.println(sayac + " hakkiniz kaldi");

            } else if (sayi > rastgelleSayi) {
                System.out.println("Daha kucuk sayi giriniz");
                System.out.println(sayac + " hakkiniz kaldi");

            } else {
                System.out.println("TEBRIKLER!!!" + (10 - sayac) + "tahminde bulundunuz");
                System.out.println("Puaniniz: " + (sayac + 1) * 10);

            }
            if (sayac == 0) {
                System.out.println("Hakkiniz bitti");
                break;
            }




        } while (sayi != rastgelleSayi);

    }
}
