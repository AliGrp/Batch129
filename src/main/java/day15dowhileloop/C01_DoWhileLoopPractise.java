package day15dowhileloop;

import java.util.Scanner;

public class C01_DoWhileLoopPractise {
    public static void main(String[] args) {
 /*
   Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
ilk 'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
*/

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen 'c ve a' harflerini içeren bir string giriniz");
        String str = input.nextLine().toLowerCase().trim();

        int sayaç=0; //'+,-'==>0 '*'==>1   str==>"" true;

        if (str.contains("a")&&str.contains("c")){
            for (int i = 0; i < str.length() ; i++) {
                if (str.charAt(i)=='a'){
                    sayaç++;
                } else if (str.charAt(i)=='c') {
                    break;

                }


            }
            System.out.println("c den önceki 'a'ların sayısı = " + sayaç);


        }else
            System.out.println("c ve a harflrini içeren ifade giriniz");





    }

}
