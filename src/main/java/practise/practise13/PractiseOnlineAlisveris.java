package practise.practise13;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PractiseOnlineAlisveris {

    /*
     * Basit bir online alisveris programi yaziniz.
     *
     * 1. Adim : "urunListesi"nden urun sectir ve kac adet istedigini sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
     *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini "toplamOdeme" ekle.
     * 4. Adim : Alisveris bitince online sitenin kurulusGunu ise ucret alma;
     *   degilse toplam odemesi gereken tutari goster.

     * */

   static List<String> urunlerimiz = new ArrayList<String>();


   static List<Double> fiyatlarimiz = new ArrayList<Double>();


    static double toplamOdenecekTutar;


    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        urunlerimiz.add("Tv : Urun Kodu : 1");
        urunlerimiz.add("Radio : Urun Kodu : 2");
        urunlerimiz.add("Refrigerator : Urun Kodu : 3");
        urunlerimiz.add("Washing Machine : Urun Kodu : 4");
        urunlerimiz.add("Toaster : Urun Kodu : 5");


        fiyatlarimiz.add(568.0);
        fiyatlarimiz.add(77.5);
        fiyatlarimiz.add(849.99);
        fiyatlarimiz.add(760.0);
        fiyatlarimiz.add(135.99);

        System.out.println("urunlerimiz = " + urunlerimiz);

        urunSecimi();
    }

    private static void urunSecimi() {

        System.out.println("Lutfen sectiginiz urunun kodunu giriniz");
        int secim = input.nextInt();


        System.out.println("Sectiginiz urunden kac adet alacaksiniz");
        int adet = input.nextInt();


        double urunTutari = adet*fiyatlarimiz.get(secim-1);
        toplamOdenecekTutar+=urunTutari;

        System.out.println("Alisverise devam etmek icin 1'e : \n Odeme icin 2'ye basiniz");
        int devamMi = input.nextInt();

        if (devamMi==1){
            urunSecimi();
        }else {
            odemeEkranimiz();
        }


    }

    private static void odemeEkranimiz() {
        System.out.println("Lutfen Dogum Tarhinizi Gun arada bir bosluk Ay olarak giriniz Giriniz");
        int dogumTarihi = input.nextInt();
        LocalDate date = LocalDate.now();
        DateTimeFormatter date1 =  DateTimeFormatter.ofPattern("dd MM");
        System.out.println(date1.format(LocalDate.now()));


        if (!date1.equals(dogumTarihi)){

            System.out.print("TEBRIKLER Dogum Gununuze Ozel %28 Indirim Kazandiniz \n " +"Indirimsiz Odenecek Tutar :" +toplamOdenecekTutar +"$" +
                    "\n Indirimli odemeniz gereken Tutar : "+String.format("%.2f",(toplamOdenecekTutar - toplamOdenecekTutar*0.28))+ " $ " );
        }else {
            System.out.println("Yine bekleriz \n Odemeiniz gereken tutar :"+toplamOdenecekTutar+"$");
        }
    }


}
