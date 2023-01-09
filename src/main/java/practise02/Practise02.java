package practise02;

import java.util.Scanner;

public class Practise02 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen işlem yapılacak sayıları giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("lütfen yapılacak işlemi giriniz +,-,/,*");
        char opr = input.next().charAt(0);

        switch (opr){
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
