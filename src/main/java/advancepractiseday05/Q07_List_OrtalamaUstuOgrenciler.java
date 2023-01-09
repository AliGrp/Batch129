package advancepractiseday05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07_List_OrtalamaUstuOgrenciler {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner input = new Scanner(System.in);
        List<Integer>notlar = new ArrayList<>();

        int sayac = 0;
        String karar;

        //KULLANICIDAN NOTLARI ALDIK
        do{
            sayac++;
            System.out.println(sayac+"Notu girlan");
            notlar.add(input.nextInt());
            System.out.println("Daha fazla not girmek icin herhangi bir karakter giriniz, Cikmak icin H giriniz");
            karar = input.next();

        }while (!karar.equalsIgnoreCase("H"));
        System.out.println("notlar= "+notlar);
        //ORTALAMA HESAPLA

        int toplam =0;

        for (int w:notlar) {
            toplam+=w;

        }
        int ortalama = toplam/ notlar.size();

        //

        int ortalamaUst =0;

        for (int w:notlar) {
            if (w>ortalama){
                ortalamaUst++;
            }

        }
        System.out.println("ortalamaUst = " + ortalamaUst);
    }
}
