package day10switchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
        //Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"
        Scanner input = new Scanner(System.in);
        System.out.println("iki ülke ismi giriniz");
        String countryName = input.nextLine();

        switch (countryName.toLowerCase()) {
            case "amerika" :
                System.out.println("us");
                break;
            case "england" :
                System.out.println("uk");
                break;
            case "türkiye" :
                System.out.println("tr");
                break;
            case "germany" :
                System.out.println("de");
                break;
            default:
                System.out.println("geçerli ülke adı giriniz");
        }
    }
}