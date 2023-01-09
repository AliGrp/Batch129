package practise03;

import java.util.Scanner;

public class Practise04 {
    public static void main(String[] args) {
        /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Satır(row) sayısını giriniz");
        int row = input.nextInt();


        for(int i=1; i<=row; i++){

            for (int k=row; k>=i; k--){

                System.out.print("X ");
            }
            System.out.println();
        }


    }
}
