package practise.practise04;

import java.util.Scanner;

public class Ssg06 {
    public static void main(String[] args) {
        String str1="12345";
        String str2="23456";
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));


        Scanner input= new Scanner(System.in);
        System.out.println("1'inci sayı girinz");
        int sayı1=input.nextInt();

        System.out.println("2nci sayıyı giriniz");
        int sayı2= input.nextInt();

        System.out.println("sayı1 + sayı2==> "+(sayı1 + sayı2));
        System.out.println(sayı1 - sayı2);
        System.out.println(sayı1 / sayı2);
        System.out.println(sayı1 % sayı2+"lira");

    }




}
