package day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();

        if(a>b){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
        double result = a>b ? a : b;
        System.out.println(result);
    }
}
