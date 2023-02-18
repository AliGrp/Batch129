package advancepractise.advancepractiseday01;

import java.util.Scanner;

public class C04_Regex_AdSoyad {
    public static void main(String[] args) {
/* kullanıcıdan adı ve soyadı ayrı ayr yazdırınız

 */
        Scanner input= new Scanner(System.in);
        System.out.println("ad ve soyadınızı arada bir boşluk bırakarak yazınız");
        String adSoyad= input.nextLine().replaceAll("[^a-z A-Z ]","").replaceAll("\\s+"," ").trim().toLowerCase();
        System.out.println("adSoyad= "+ adSoyad);
        String ad = adSoyad.split("  ")[0];
        String soyAd = adSoyad.split(" ")[1];

        String ilkHarf=ad.substring(0,1).toUpperCase();
        String soyAdİlkHarf= soyAd.substring(0).toUpperCase();

        String adFormat= ilkHarf+ad.substring(1);
        String soyAdFormat= soyAdİlkHarf+soyAd.substring(1);
        System.out.println("ad: "+adFormat);
        System.out.println("Soyad: "+soyAdFormat);




    }
}
