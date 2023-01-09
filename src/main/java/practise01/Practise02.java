package practise01;

import java.util.Scanner;

public class Practise02 {
    public static void main(String[] args) {
           /*
   Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
   Eger calisan kadinsa 60 yasindan buyukse “Emekli Olabilir “yazdirin
   Eger calisan erkek ise 65 yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz B/E :");
        String c1 = input.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        int age = input.nextInt();

        if (age <= 0 || age >= 120) {
            System.out.println("Lütfen 0 ve 120 değerleri arasında yaşınızı giriniz");

        }
        else if (c1.equalsIgnoreCase("kadın")) {
            if (age > 60) {
                System.out.println("emekli olabilir");
            } else {
                System.out.println("çalımalı");

            }
        } else if (c1.equalsIgnoreCase("erkek")) {
            if(age>65){
                System.out.println("emekli olabilir");
            }else{
                System.out.println("çalışmalı");
            }

        }else{
            System.out.println("tanımlı değil");
        }
    }
}