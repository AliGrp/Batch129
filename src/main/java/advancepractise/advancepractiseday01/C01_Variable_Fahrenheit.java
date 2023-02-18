package advancepractise.advancepractiseday01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C01_Variable_Fahrenheit {
    public static void main(String[] args) {

        //Fahrenneit değeri celcius çevir
        // foormül: c=(f-32)*5/9

        Scanner input=new Scanner(System.in);
        System.out.println("fahrenheit değeri giriniz");
        double f = input.nextDouble();
        double c = (f-32)*5/9;
        System.out.println(c);
        DecimalFormat format = new DecimalFormat("0.00");
        String formatcelcius =format.format(c);
        System.out.println("formatcelcius= "+ formatcelcius);
        System.out.printf("formatlı= "+"%.2f",c); // bunu yaptığımızda yukardaki gibi konteynır oluşturup içine atmamıza gerek yok



    }


    }

