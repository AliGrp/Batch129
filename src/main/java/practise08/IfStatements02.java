package practise08;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz");
        String gunİsmi= input.nextLine().toLowerCase();

        if (gunİsmi.equals("pazar")||gunİsmi.equals("cumartesi")){
            System.out.println("Haftasonu");

        }else {
            System.out.println("Haftaiçi");
        }

        if (gunİsmi.equals("pazartesi")||
        gunİsmi.equals("salı")||
        gunİsmi.equals("çarşamba")||
        gunİsmi.equals("perşembe")||
        gunİsmi.equals("cuma")){
            System.out.println("Hafta içi");
        }

    }
}
