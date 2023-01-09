package practise01;

import java.util.Scanner;

public class Practise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen tek sayı griniz");
        int tekSayı= input.nextInt();
        if(tekSayı%2!=0){

        }else{
            System.out.println("çift sayı girdiniz");
        }


        System.out.println("Lüten Çift sayı girinşz");
        int çiftSayı = input.nextInt();

        System.out.println(çiftSayı+tekSayı);
    }
}
