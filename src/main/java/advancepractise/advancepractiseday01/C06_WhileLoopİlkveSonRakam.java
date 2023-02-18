package advancepractise.advancepractiseday01;

import java.util.Scanner;

public class C06_WhileLoopİlkveSonRakam {
    public static void main(String[] args) {
        // kullanıcıdan bir sayı alın ilk ve son rakamalarını toplayın

        Scanner input= new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int numb= input.nextInt();
        if (numb<0){
            System.out.println("0 dan büyük bir sayı giriniz");

        }
//1.yol:
        int sonRkm= numb%10;
        System.out.println("sonRkm = " + sonRkm);
        int ilkRakam = numb;

        while (ilkRakam>9){
            ilkRakam/=10;
        }
        System.out.println("ilkRakam = " + ilkRakam);
        System.out.println("Toplam = " + ilkRakam+sonRkm);

//2.Yol:
        String sayıString = String.valueOf(numb);
        int ilkRkm= Integer.valueOf(sayıString.substring(0,2));
        int soniRkm= Integer.valueOf(sayıString.substring(sayıString.length()-2));
        System.out.println("soniRkm+ilkRkm = " + (soniRkm+ilkRkm));



    }
}
