package day03scanner;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen toplanacak olan tek haneli sayı giriniz");
        int teksayı = input.nextInt();
        System.out.println("Lütfen toplanacak olan çift haneli sayı giriniz");
        int çiftsayı = input.nextInt();
        System.out.println("****");

        System.out.println(teksayı + çiftsayı);
    }
}
