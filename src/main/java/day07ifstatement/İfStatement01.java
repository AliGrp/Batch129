package day07ifstatement;

import java.util.Scanner;

public class İfStatement01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir chraacter giriniz");
        char ch = input.next().charAt(0);
        if(ch>='A'&& ch<='Z'){
        System.out.println("büyük harf");
    }
         else if (ch>= 'a'&&ch<='z') {
        System.out.println("küçük harf");

    }else{
            System.out.println("Harf değil");
        }
    }



}
