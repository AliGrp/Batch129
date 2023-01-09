package day03scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 5 basamaklı sayı giriniz");
        int num = input.nextInt();
        int ilkIkıRkm = num/1000;
        System.out.println("ilkIkıRkm = " + ilkIkıRkm);
         int ilkİkiTop = (ilkIkıRkm % 10) + (ilkIkıRkm / 10);
        System.out.println("ilkİkiTop = " + ilkİkiTop);

        int sonİkiRkm = num % 100;
        System.out.println("sonİkiRkm = "  + sonİkiRkm);
        int sonİkiTop = (sonİkiRkm % 10) + (sonİkiRkm / 10);
        System.out.println("sonİkiTop = " + sonİkiTop);
        int toplam = ilkİkiTop + sonİkiTop;
        System.out.println("toplam = " + toplam);


    }
}
