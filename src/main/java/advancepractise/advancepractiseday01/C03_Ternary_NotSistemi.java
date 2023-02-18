package advancepractise.advancepractiseday01;

import java.util.Scanner;

public class C03_Ternary_NotSistemi {
    public static void main(String[] args) {
        /* yüzlük notu kullanıcıdan alıp harf not çevirin
        90 ve üstü A/ 80-89 B/ 70-79 C/ 60-69 D/ 50-59 E/ Diğerler F/
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Notunuzu sayı cinsinden girin");
        double notSayı= input.nextDouble();

        String notHarf = notSayı>100 ?
                "0-100 ARASI BİR DEĞER GİRİNİZ" : notSayı > 89 ?
                "A" : notSayı>79 ?
                "B" : notSayı>69 ?
                "C" : notSayı>59 ?
                "D" : notSayı>49 ?
                "E" : notSayı>-1 ? "F":"0-100 arası bir değer giriniz";
        System.out.println("notunun harf karşılığı= "+notHarf);


    }
}
