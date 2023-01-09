package day05typecastinstringmanipulations;

import java.util.Scanner;

public class FreeStudy01 {
    //TechProEd spor salonu icin kullanicidan isim; soyisim; yas;
     //kilo; boy; salona devam edecegi ay suresi bilgilerini alip aylik 20 $
   // olarak toplam ucreti yazdiriniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TechProEd spor salonuna hosgeldiniz...");
        System.out.println("Lütfen isiminizi giriniz");
        String isim = input.nextLine();

        System.out.println("Lütfen soyisiminizi yazınız");
        String soyİsim = input.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        byte yaş = input.nextByte();

        System.out.println("Lütfen kilonuzu giriniz");
        double kilo = input.nextDouble();

        System.out.println("Lütfen boyunuzu giriniz");
        double boy = input.nextDouble();

        System.out.println("Lütfen kaç ay devam edeceğinizi yazın");
        int ay = input.nextInt();

        int aylıkÜcret= 20;
        System.out.println("aylıkÜcret+ = " + aylıkÜcret+"$");

        int toplamÜcret = aylıkÜcret*ay;
        System.out.println("toplamÜcret+\"$\" = " + toplamÜcret+"$");



        }

    }


