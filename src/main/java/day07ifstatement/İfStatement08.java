package day07ifstatement;

import java.util.Scanner;

public class İfStatement08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("LÜTFEN BİR SAYI GİRİNİZ");
        int n1 = input.nextInt();

        if(n1%2==0){
            System.out.println("çift sayı");
        }if(n1%2!=0){
            System.out.println("tek sayı5");
        }
    }
}
