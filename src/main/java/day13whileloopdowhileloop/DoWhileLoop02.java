package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {

        /* kullanıcıdan bir tam sayı alınız
        tam sayı 100den küçük ise kullanıcıya "kaybettiniz" mesajı vererek
        oyunu sonlandırınız.
        tam sayı 100 ve 100 den büyük ise "kazandınız!" mesajı vererek oyuna devam ettiriniz

         */

        Scanner input = new Scanner(System.in);

        int num = 0;

        do{
            System.out.println("Bir sayi giriniz...");
            num = input.nextInt();


            if(num>=100){
                System.out.println("Kazandiniz!");
            }

        }while(num>=100);

        System.out.println("Kaybettiniz!");

    }



    }
