package practise.practise01;

import java.util.Scanner;

public class Practise17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Ülke İsmi Giriniz");
        String countryName = input.nextLine();


        switch(countryName.toLowerCase()){
            case "amerika" :
                System.out.println("us");
                break;

            case "türkiye":
                System.out.println("Tr");
                break;

            case "germany":
                System.out.println("DE");
                break;
            default:
                System.out.println("geçerli ülke adı giriniz");


        }
    }
}
