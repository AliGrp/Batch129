package advancepractise.advancepractiseday06;

import java.util.Scanner;

public class Q02_Palindrom {
    public static void main(String[] args) {

        //Bir String değerin Palindrome olup olmadığını kontrol eden bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("ilk String deger giriniz");
        String str=input.nextLine().replaceAll(" ","");
//        String strReverse = "";
//
//
//        for (int i =str.length()-1; i >-1 ; i--) {
//
//            strReverse+=str.charAt(i);
//
//
//        }
//        System.out.println("strReverse = " + strReverse);
//
//        if (str.equals(strReverse)){
//            System.out.println("Palindrom");
//        }else {
//            System.out.println("Plaindrom Degil");
//        }

        System.out.println("Bir String değer giriniz");
        String str2 = input.nextLine().replaceAll(" ","").toLowerCase();
        System.out.println("str2 = " + str2);

        StringBuilder stb = new StringBuilder(str2);
        System.out.println("stb = " + stb);
        String str2Reverse = stb.reverse().toString();
        System.out.println("Reverse() sonrası stb: "+stb);

        if(str2.equals(str2Reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome DEĞİL");
        }
    }
}
