package day07ifstatement;

import java.util.Scanner;

public class İfStatement02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int num = input.nextInt();

        if(num%2==0){
            System.out.println("çift sayı");
        }else{
            System.out.println("Tek sayı");
}


    }
}
