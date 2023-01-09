package practise01;

import java.util.Scanner;

public class Practise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char s = input.next().charAt(2);
        System.out.println("      "+s+"   ");
        System.out.println("   "+s+"    "+s+"");
        System.out.println(" "+s+"       "+s+"");
        System.out.println("      "+s+"");
        System.out.println("      "+s+"");
        System.out.println("      "+s+"");
        System.out.println("      "+s+"");
        System.out.println("      "+s+"");
    }
}
