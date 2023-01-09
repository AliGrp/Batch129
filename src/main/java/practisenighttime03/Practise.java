package practisenighttime03;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bie sayı giriniz");
        int sayı= input.nextInt();

        int j = 0;
        switch (sayı) {
            case 2 :
                j += 6;
                break;
            case 4 :
                j += 1;
                break;
            case 1 :
                j += 4;
                break;
            default :
                j += 2;
        }
        System.out.println("j = " + j);
    }
}
