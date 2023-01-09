package day07ifstatement;

import java.util.Scanner;

public class İfStatement03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int num1 = input.nextInt();

        if(num1>0){
            System.out.println("pozitif");
        } else if (num1<0) {
            System.out.println("negatif");
        }else{
            System.out.println("notr");
        }
    }
}
