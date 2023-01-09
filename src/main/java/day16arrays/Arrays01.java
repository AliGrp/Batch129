package day16arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        // Ex1: Kullanıcıyla beraber bir array olşturun

        Scanner input = new Scanner(System.in);
        System.out.println("kaç öğrenci ismi gireeksiniz");
        int numOfElements = input.nextInt();

        System.out.println("kaç öğrenci ismi gireceksiniz");

        String stdNames[]=new String[numOfElements];

        for (int i = 1; i <=numOfElements ; i++) {
            System.out.println("lütfen"+i+". öğrencinin adını giriniz");
            String stdname = input.next();
            if (stdname.equalsIgnoreCase("Q")){
                break;
            }

            stdNames [i-1]=stdname;


        }
        System.out.println(Arrays.toString(stdNames));


    }
}
