package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop04 {
    public static void main(String[] args) {
        /* kullancıdan başlangıç ve bitiş sayıarını alın
        aradaki tüm çift sayıları yazın
         */
        Scanner input = new Scanner(System.in);
        System.out.println(" başlangıç değerlerini giriniz");
        int start = input.nextInt();

        System.out.println("bitiş değerini giriniz");
        int end = input.nextInt();
        if(start>end){
            System.out.println("başlangıç değeri bitişten küçük olamaz");
        }

        for(int i=start; i<=end; i++){
            if(i%2==0){
                System.out.println(i+" ");
            }
        }
    }
}
