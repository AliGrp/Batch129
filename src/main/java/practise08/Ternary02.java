package practise08;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz");
        int sayı= input.nextInt();

        Object num =sayı%2==0? "çift":"tek";
        System.out.println(num);
    }
}
