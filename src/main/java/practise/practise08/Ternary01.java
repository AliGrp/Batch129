package practise.practise08;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz");
        int sayı= input.nextInt();

        System.out.println(sayı>100? sayı*sayı  : "sayı yüzden büyük olmalı") ;

        Object num= sayı>100? sayı*sayı  : "sayı yüzden büyük olmalı";
        System.out.println(sayı);

    }
}
