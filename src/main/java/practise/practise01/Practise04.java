package practise.practise01;

import java.util.Scanner;

public class Practise04 {
    public static void main(String[] args) {
        //verilen ismin ilk harfini ve soy isminin son harfini yazdırınız g

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen isim ve soyisminizi giriniz");
        String name = input.nextLine();

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char second = name.trim().toLowerCase().split(" ")[1].charAt(0);
        System.out.println(second);
        System.out.println(""+first+second);
    }
}
