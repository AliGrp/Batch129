package mini_projects.biletbus;

import java.util.Scanner;

import static mini_projects.biletbus.Bilet.biletDokum;
import static mini_projects.biletbus.Bilet.slowPrint;

public class BiletPractise {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int km=0;
        int yas = 0;
        int yolculukTipi=1;

        String plakaNumarasi="78 MB 78";
        System.out.println("Lutfen Gideceginiz Mesafeyi Km olarak Giriniz");
         km = input.nextInt();

        System.out.println("Lutfen yasinizi giriniz");
         yas= input.nextInt();

        System.out.println("Lutfen yolculuk tipini giriniz"+" Sadece Gidis ise 1\ngidis-Donus ise 2");
        yolculukTipi = input.nextInt();

        if (yas>0 && km>0 && (yolculukTipi==1||yolculukTipi==2)){
           double biletFiyati=km*0.10;
            System.out.println("Indieimsiz biletFiyati = " + biletFiyati);

            double yasIndrimOranii=0;
            if (yas<12){
                yasIndrimOranii =0.5;
            } else if (yas<24) {
                yasIndrimOranii = 0.1;
            } else if (yas>=65) {
                yasIndrimOranii=0.3;

            }

            biletFiyati-=biletFiyati*yasIndrimOranii;


            if (yolculukTipi==2){
                biletFiyati-=biletFiyati*0.2;
                biletFiyati*=2;
            }
            biletDokum(plakaNumarasi,km,yolculukTipi,biletFiyati,yasIndrimOranii);

        }else System.out.println("Hatali Giris Yaptiniz");


    }
    public static void biletDokum(String plakaNumarasi,int km, int yolculukTipi,double biletFiyati, double yasIndrimOranii){
        System.out.println("====== Bilet Dokum ======");
        System.out.println("Otobusun Plakasi "+plakaNumarasi);
        System.out.println("Mesafe "+km);
        System.out.println("Yolculuk Tipi "+(yolculukTipi==1 ? "Tek Yon" : "Gidis Donus "));
        System.out.println("Bilet ucreti "+biletFiyati);


        slowPrint("Keyifli Yolculuklar Dileriz....",500);
        System.out.println();

    }

}
