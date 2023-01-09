package day08nestedifternary;

import java.util.Scanner;

public class Nestedif05 {
    public static void main(String[] args) {
          /*
        Kullanicidan bir gun alin
        Eger gun cuma ise "Muslumanlar Icin Kutsal Gun" ;
        Eger gun cumartesi ise "Yahudiler icin Kutsal Gun"
        Eger gun pazar ise "Hristyanlar icin Kutsal Gun"
         yazdiran kodu olusturunuz
         */

        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen gun ismi giriniz");
        String gun = input.next().toLowerCase();//kucuk harfe cevirdik Cuma

        if(gun.equalsIgnoreCase("cuma")){
            System.out.println("müslümanlar için kutsal gün");
        } else if (gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("yahudiler için kutsal gün");

        } else if (gun.equalsIgnoreCase("pazar")) {
            System.out.println("hrisiyanlar için kutsal gün");

        }else{
            System.out.println("kutsal bir gün değil");
        }

    }
}
