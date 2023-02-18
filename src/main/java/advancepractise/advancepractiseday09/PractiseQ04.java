package advancepractise.advancepractiseday09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PractiseQ04 {
     /*
        Basit bir 5 ürünlü manav alışveriş programı yazınız.

    * 1. Adim : Ürün ve fiyat listesi oluştur.
    * 2. Adim : Ürün listesinden kod ile ürün seçtir ve kaç kilo olduğunu sor.
    * 3. Adim : Müşteri her ürün seçtiğinde, aldığı ürünün fiyatını toplam fiyata ekle.
    * 4. Adim : Alisveris bitince ödemesi gereken tutari göster.
    * 5. Adim : Başka bir ürün almak isteyip istemediğini sor.
    *            istemiyorsa ödenecek tutarı göster, istiyorsa tekrar ürün sectir.
    *            Bu işlemi alışveriş bitene kadar tekrarla.

    */

    static List<String> urunlist = new ArrayList<String>();

    static double toplamOde;

    public static void main(String[] args) {

        urunlist.add("\nDomates - Ürün Kodu: 1 - Fiyatı: 20\n");
        urunlist.add("Biber - Ürün Kodu: 2 - Fiyatı: 25\n");
        urunlist.add("Patates - Ürün Kodu: 3 - Fiyatı: 9\n");
        urunlist.add("Elma - Ürün Kodu: 4 - Fiyatı: 15\n");
        urunlist.add("Muz - Ürün Kodu: 5 - Fiyatı: 30");

        System.out.println("urunlist = " + urunlist);
        System.out.println("toplam odeme ="+toplamOde);
        musterisec();
    }

    public static void musterisec(){
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sectiginiz urunun kod numarasini giriniz");
        int code = input.nextInt();

        System.out.println(" Kac kilo ");
        double kilo = input.nextDouble();


        System.out.println(kilo + " kilo " + urunlist.get(code - 1).substring(0, urunlist.get(code - 1).indexOf(" ")) + ": "
                + Double.parseDouble(urunlist.get(code - 1).substring(urunlist.get(code - 1).lastIndexOf(" ") )) * kilo);
        toplamOde += Double.parseDouble(urunlist.get(code - 1).substring(urunlist.get(code - 1).lastIndexOf(" ") )) * kilo;
        System.out.println("toplamOdeme = " + toplamOde);

        System.out.println("Devam etmek için D, kasa için herhangi bir karakter giriniz");
        String karar = input.next();

        if (karar.equalsIgnoreCase("d")) {
            musterisec();
        } else {
            System.out.println("toplamOdeme = " + toplamOde);
            System.out.println("Güle güle, yine bekleriz...");
        }
    }

}
