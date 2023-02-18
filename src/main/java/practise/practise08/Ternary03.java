package practise.practise08;

import java.util.Scanner;

public class Ternary03 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("iki tam sayı giriniz");
        int sayı= input.nextInt();
        int sayı2= input.nextInt();

        System.out.println(sayı>0 && sayı2>0 ? sayı*sayı2 : "çarpamıyorum");

        }

    }

