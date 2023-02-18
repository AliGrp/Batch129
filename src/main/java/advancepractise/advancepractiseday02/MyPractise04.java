package advancepractise.advancepractiseday02;

import java.util.Scanner;

public class MyPractise04 {
    public static void main(String[] args) {

        /*
		Şekli Yazdırınız:

        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F

        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen  bir sayi giriniz");
        int num = input.nextInt();
        System.out.println("Lutfen bir karakter giriniz");
        char ch = input.next().charAt(0);


            for (int i = 0; i < num; i++) {

                for (int j = 0; j < i + 1; j++) {
                    System.out.print((char) (ch + i) + " ");

                }
                System.out.println();
            }



        }

        }




