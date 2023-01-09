package day21listvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PractiseList03 {
    public static void main(String[] args) {
           /*
                        SAYI TAHMIN OYUNU
            Oyuncudan 1-10 arasi bir sayi isteyiniz
            Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
            Yoksa verdigi sayiyi listenize ekleyiniz.
            Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
            [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
            [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
            [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Oyunumuza hos geldiniz...");
        System.out.println("Oyunu sonlandirmak icin Q ya basiniz...");

        List<String> numList= new ArrayList<>();
        numList.add("6");
        numList.add("3");
        numList.add("1");
        numList.add("8");

        int counter=0;
        String num="";

        do {
            System.out.println("Lutfen 1-10 arsinda bir tam sayi giriniz");
            num=input.next();

            if(num.equalsIgnoreCase("Q")){
                break;

            } else if (numList.contains(num)) {
                numList.set(numList.indexOf(num),"BINGO");
                counter++;
            }else {
                numList.add(num);
            }

        }while (counter!=numList.size());

        if(!num.equalsIgnoreCase("Q")){
            System.out.println("KAZANDINIZ");

        }else {
            System.out.println("Kendi isteginizle ayrildiniz");
        }
        System.out.println("Final report: " + numList);
    }

}
