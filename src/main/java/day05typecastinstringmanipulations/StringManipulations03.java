package day05typecastinstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordunuzu giriniz");
        String pwd = input.nextLine();

        boolean first = pwd.length()>7;
        boolean second = !pwd.contains(" ");
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;
        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("Password geçerli mi"+(first&&second&&third&&fourth&&fifth&&sixth));

    }
}
