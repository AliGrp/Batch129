package day10switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        //Ex 1: Kullanıcıdan iki sayı ve yapılacak işleri alan ve +,-,*,/,% işlemleri yapan kodu yazın

        Scanner input = new Scanner(System.in);
        System.out.println("kullanıcıdan iki sayınız");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("yapılacak işlemi girin +,-,*,/,%");
        char opr = input.next().charAt(0);

        switch (opr) {
            case'+':
                System.out.println(a+"+"+ b +"="+(a+b));
                break;
            case '-':
                System.out.println(a+"-"+ b +"="+(a-b));
                break;
            case '*':
                System.out.println(a+"*"+ b +"="+(a*b));
                break;
            case '/':
                System.out.println(a+"/"+ b +"="+(a/b));
                break;
            case '%':
                System.out.println(a+"%"+ b +"="+(a%b));
                break;
            default:
                System.out.println("bu işlem tanımlanamdı");
        }


    }
}