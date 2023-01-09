package day07ifstatement;

import java.util.Scanner;

public class İfStatement09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("BİR HARF GİRİNİZ");
        char ch2 = input.next().charAt(0);

        if(ch2>='A'&& ch2<='Z'){
            System.out.println("BÜYÜK HARF");
        }if(ch2>='a'&& ch2<='z'){
            System.out.println("KÜÇÜK HARF");
        }else{
            System.out.println("HARF DEĞİL");
        }

    }
}