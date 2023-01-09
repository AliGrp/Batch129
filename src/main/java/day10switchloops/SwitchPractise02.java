package day10switchloops;

import java.util.Scanner;

public class SwitchPractise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ingilizce harf yaziniz");
        char ch = input.next().toLowerCase().charAt(0);

        switch (ch){

            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println("=="+ ch + "=="+ "unlu bir harftir");
                break;
            default:
                System.out.println("=="+ ch + "=="+ "unsuz bir harftir");
        }
    }
}
