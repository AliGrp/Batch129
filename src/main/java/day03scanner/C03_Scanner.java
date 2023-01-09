package day03scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz..");
        String isim = scan.nextLine();
        System.out.println("Lütfen memleketinizi giriniz");
        String memleket = scan.nextLine();
        System.out.println("Lütfen boyunuzu giriniz");
        int boy = scan.nextInt();
        System.out.println("Lütfe yaşadığınız şehri sevip sevmediğinizi yazınız");
        boolean seviyorMu = scan.hasNextBoolean();

        System.out.println("******");

        System.out.println("seviyorMu = " + seviyorMu);
        System.out.println("boy = " + boy);
        System.out.println("memleket = " + memleket);
        System.out.println("isim = " + isim);

    }
}
