package day03scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // kullanıcan bir dikdörtgenn alan ve çevresini hesaplayan kodu yazınız.

        System.out.println("Lütfen dikdörtgenin kısa kenarı giriniz");
        int en = input.nextInt();

        System.out.println("Lütfen dikdörtgenin uzun kenarını giriniz");
        int boy = input.nextInt();

        System.out.println("Alan=="+(en * boy));
        System.out.println("Çevre=="+(2*(en+boy)));

//dairenin alanını kullanıcıdan alın ve hesplayınız
        System.out.println("Lütfen dairenin yarı çapını giriniz");
        int rCircle = input.nextInt();
        System.out.println("alan=="+(3*rCircle));

    }
}
