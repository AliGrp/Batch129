package day21listvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List01 {
    public static void main(String[] args) {

        //verilen bir listteki elelmanlari tekrarsiz olarak yazdirin
        // [

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);

        List<Integer> newMyList = new ArrayList<>();

        for (Integer w:myList
             ) {
            if (!newMyList.contains(w)){
                newMyList.add(w);

            }

        }
        System.out.println(newMyList);

        //Example 2 Musteriden iki urun aliniz
        //          Musterinin verdigi urun listede varsa ismini yazdirin
        //             Musterinin verdigi urun yoksa "out of stack" yazdirin

        Scanner input= new Scanner(System.in);
        System.out.println("Urun arama sistemimize hosgeldiniz");
        System.out.println("Urum aramayi sonlandiurmak icin Q'ya basiniz");



        List<String> products = new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobile Phone");
        /*
        for-each kurunuz products listindeki her bir elemanin tum karekterlerini set method kullanarak her binini kucuk harfe cevirin
        Kullanicidan gelen urun isminide kucuk harfe cevirin
         */

        do{
            System.out.println("Aradiginiz urunun ismini giriniz");
            String p = input.nextLine();

            if (p.equalsIgnoreCase("Q")){
                break;

            } else if (products.contains(p)) {
                System.out.println(p + " is in stock");

            }else {
                System.out.println(p + " Out of stock!...");
            }


        }while (true);
        System.out.println("Sitemizi kullandiginiz icin tesekkur eder tekrar bekleriz");
    }
}
