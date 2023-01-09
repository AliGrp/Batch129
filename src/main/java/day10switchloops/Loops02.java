package day10switchloops;

import java.util.Locale;

public class Loops02 {
    public static void main(String[] args) {
        //ex1: 21 den 180e kadar hem 4 hemde 6 ile bölünebilin tam sayıları ekrana yazdıran kodu yazın

        for(int a= 21; a<180 ; a++){
            if(a%4==0 && a%6==0){
                System.out.print(a+" ");
            }
        }
        System.out.println();

        //ex2: size verilen küçük harfleyazılmış stringin indexi çift olan karakterleri büyük harf yapın
        // ankara ==> AnKaRa
        String s = "ankara";
       for ( int i=0 ; i<s.length() ;i++){
           String ch = s.substring(i,i+1);
           if(i%2==0){
               System.out.println(ch.toUpperCase());
           }


        }
    }

}
