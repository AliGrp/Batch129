package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhile03 {
    public static void main(String[] args) {
        /* username="admin" Password="pwd123" dür
           Kullanıcıdan username ve passwordu alın
           username ve password doğru ise "Hesabınıza hoşgeldin yazdırın
           bilgiler yanlış ise 3 defa "username ve passwordunuzu tekrar giriniz mesajı versin
           bilgiler 4 defa  yanlış girilirse hesabınız bloke olmuştur nesajı veriniz

         */
        Scanner input = new Scanner(System.in);


        int counter = 0; //sayaç çünkü girişi sayacak

        do {
            if (counter == 4) {
                System.out.println("hesabınız bloke olmuştur");
                break;

            }
            System.out.println("Lütfen username giriniz");
            String uName = input.next();

            System.out.println("Lütfen password giriniz");
            String pwd = input.nextLine();

            if (uName.equals("admin") && pwd.equals("pwd123")) {
                System.out.println("hesabınıza hoşgeldiniz");
                break;

            }
            counter++;


        }while (true);
    }
}