package oyun;

import java.util.Random;
import java.util.Scanner;

public class Oyun01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ve alti arasi bir tam sayi giriniz");
        Random rnd = new Random();
        int sayac1 = 0, sayac2 = 0;

        int[] player1 = new int[10];
        int[] player2 = new int[10];


        for (int i = 0; i < 10; i++) {
            player1[i] = rnd.nextInt(6) + 1;
            player2[i] = rnd.nextInt(6) + 1;

            System.out.println("Player 1 => " + player1[i]);
            System.out.println("Player 2 => " + player2[i]);

            if (player1[i] > player2[i]) {
                sayac1++;
            } else {
                sayac2++;
            }

            System.out.println("-----------");

            System.out.println("Skor : " + sayac1 + " - " + sayac2);

            System.out.println("------------");


        }
        if (sayac1 > sayac2) {
            System.out.println("Player 1 kazandi");

        } else if (sayac2 > sayac1) {
            System.out.println("Player 2 kazandi");

        } else {
            System.out.println("Berabere");
        }
    }
}
