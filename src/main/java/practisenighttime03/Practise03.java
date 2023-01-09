package practisenighttime03;

import java.util.Scanner;

public class Practise03 {
    public static void main(String[] args) {
        // kullanıcının verdiği sayı için çarpım tablosunu oluşturup console yazdırın
        // 3==>3x1=3 3x2=6 3x3=9 ...... 3x10=30
        Scanner input = new Scanner(System.in);
        System.out.println("Çarpım tablosunu görmek için bir sayı giriniz..");
        double num= input.nextDouble();

     int i=1;

     while (i<11){
         System.out.println(num+"x"+i+"="+(num*i));
         i=i+2;

     }

     int s=1;
     do {
         System.out.println("sen bir whilw loopsun");
         s++;


     }while (s<5);
    }
}
