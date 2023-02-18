package practise.practise01;

import java.util.Scanner;

public class Practise16 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("LÜtfen password giriniz");
        String pwd = input.nextLine();

        boolean first = pwd.length()>7;
        boolean second = !pwd.contains(" ");
        boolean third = pwd.replaceAll("[^a-z]","").length()>0;
        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;
        boolean fifth = pwd.replaceAll("[a-z,A-Z,0-9]","").length()>0;
        boolean sixth= pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("Password Geçerli mi?"+(first&&second&&third&&fourth&&fifth&&sixth));
    }
}
