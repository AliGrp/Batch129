package practise.practise01;

import java.util.Locale;
import java.util.Scanner;

public class Practise07 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz");
        String name = input.nextLine().toLowerCase();
        System.out.println("Lütfen Doğum Yerinizi Giriniz");
        String bornPlace = input.nextLine();
        System.out.println("Lütfen Yaşınızı Giriniz");
        byte age= input.nextByte();
        System.out.println("Lütfen Yaşadığınız Şehri Sevip Sevmediğinizi Belirtin");
        boolean isLove = input.hasNextBoolean();

        System.out.println("name = " + name);
        System.out.println("bornPlace = " + bornPlace);
        System.out.println("age = " + age);
        System.out.println("isLove = " + isLove);

    }
}
