package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
        //Aşağıdaki şekili konsolo yazdırmak için kod oluşturun
        // x x x x
        //x x x x
        //x x x x

        Scanner input = new Scanner(System.in);
        System.out.println("Satır(row) sayısını giriniz");
        int row = input.nextInt();
        System.out.println("Sutun(column) sayısını giriniz");
        int column = input.nextInt();


        for(int i=1; i<=row; i++){

            for(int k=1; k<=column; k++){
                System.out.print("X ");
            }
            System.out.println();



        }
    }

}
