package day07ifstatement;

import java.util.Scanner;

public class İfStatement06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = input.nextInt();

        if (yas > 30 || yas < 0){
            System.out.println("Gecerli bir yas giriniz");
        } else if (yas >= 0 && yas <=4){
            System.out.println("Bebek");
        } else if (yas >= 5 && yas <=12){
            System.out.println("Cocuk");
        } else if (yas >= 13 && yas <=20){
            System.out.println("Genc");
        } else {
            System.out.println("Yetiskin");
        }
    }
}
