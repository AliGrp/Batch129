package day10switchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //ex1: Ay numarasını sm-öyleyince numarası verilen aydan
        //başlayıp 12 aydan başlayıp tüm ayların isimlerini yazdıran kodu yazın
        // 8 ==> Agust september october november december
        Scanner input = new Scanner(System.in);
        System.out.println("başlangıç ayının kaçıncı ay olduğunu giriniz");
        int numOfMonth = input.nextInt();

        switch (numOfMonth){
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("agust");
            case 9:
                System.out.println("september");
            case 10:
                System.out.println("october");
            case 11:
                System.out.println("november");
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("geçerli ay numarası giriniz");
        }


    }
}
