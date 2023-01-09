package day10switchloops;

import java.util.Scanner;

public class SwitchPractise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ayaykkabi numarasini giriniz giriniz");
        int ayakkabiNumarasi = input.nextInt();

        switch (ayakkabiNumarasi){
            case 36:
            case 37:
            case 38:
                System.out.println("Small");
                break;
            case 39:
            case 40:
            case 41:
                System.out.println("Medium");
                break;
            case 42:
            case 43:
            case 44:
                System.out.println("Large");
                break;
            case 45:
            case 46:
            case 47:
                System.out.println("Extral");
                break;

            default:
                System.out.println("Lutfen gecerli bir numara giriniz");
        }

    }
}
