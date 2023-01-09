package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop03 {
    public static void main(String[] args) {

        /*
        *  *  *  *
        *  *  *
        *  *
        *
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Satır(row) sayısını giriniz");
        int row = input.nextInt();

        for(int i=1; i<=row; i++ ){
            for(int k=row; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
