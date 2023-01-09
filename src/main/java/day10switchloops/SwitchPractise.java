package day10switchloops;

import java.util.Scanner;

public class SwitchPractise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ayının kaçıncı ay olduğunu giriniz");
        int ayNo = input.nextInt();

        switch (ayNo){
            case 12:
            case 1:
            case 2:

                System.out.println("WINTER");
                break;

            case 3 :
            case 4 :
            case 5 :
                System.out.println("SPRING");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("SUMMER");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("AUTMN");
                break;



            default:
                System.out.println("Lutfen gecerli ay giriniz");
        }
    }
}
