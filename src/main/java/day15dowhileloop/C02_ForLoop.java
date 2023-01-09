package day15dowhileloop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
// sekilde yazdiriniz, bosluk " " veya 'a' harfi geldiginde bunlari yazmasin

        Scanner input =new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String str= input.nextLine().replaceAll("[^a-z A-Z ]","").trim();

        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i)=='a' || str.charAt(i)==' '){
                continue;
            }
            System.out.println();

        }

    }
}
