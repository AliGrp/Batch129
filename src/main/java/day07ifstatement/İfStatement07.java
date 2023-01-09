package day07ifstatement;

import java.util.Scanner;

public class İfStatement07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("doğum ayınızı giriniz");
        String m1 = input.nextLine();
        if(m1.equals("1")){
            System.out.println("january");
        } else if (m1.equals(2)) {
            System.out.println("february");


        }else{
            System.out.println("geçersiz");
        }
    }
}
