package advancepractise.advancepractiseday13;

import java.util.Arrays;

public class Q03_Enum_BeslenmeEgzersiz {
    //Aylara göre sebze ve meyve tavsiyesi içeren ve toplam yapılması gereken egzersiz saatlerini söyleyen bir kod yazınız.
    //20 saat üstü egzersiz yapılacak ayları ekrana yazdırınız.

    public static void main(String[] args) {


        for (BeslenmeEgzersiz w:BeslenmeEgzersiz.values()) {
            if (w.toplamEgzersizSaati>=20){
                System.out.println(w);
            }
        }
        System.out.println("BeslenmeEgzersiz.Ocak.toplamEgzersizSaati = " + BeslenmeEgzersiz.Ocak.toplamEgzersizSaati);
        System.out.println("BeslenmeEgzersiz.Ekim.ayinMeyvesi = " + BeslenmeEgzersiz.Ekim.ayinMeyvesi);
        System.out.println("BeslenmeEgzersiz.valueOf(\"Mart\").ayinMeyvesi = " + BeslenmeEgzersiz.valueOf("Mart").ayinMeyvesi);
       BeslenmeEgzersiz.values()[1].ayinMeyvesi = "Portakal";
        System.out.println("BeslenmeEgzersiz.values()[1] = " + BeslenmeEgzersiz.values()[1].ayinMeyvesi);
    }
}
