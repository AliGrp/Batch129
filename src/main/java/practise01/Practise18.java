package practise01;

import java.util.Scanner;

public class Practise18 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String pasword="";
        do{
            System.out.println("Paswordunuzu giriniz");
            pasword = scan.nextLine();

                System.out.println("Yanlis");


        }while (!(pasword.equals("Alican")));
        System.out.println("Dogru");
    }
}
