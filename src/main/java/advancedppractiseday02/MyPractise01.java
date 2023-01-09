package advancedppractiseday02;

import java.util.Arrays;
import java.util.Scanner;

public class MyPractise01 {
    public static void main(String[] args) {
          /*
     Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */

        Scanner input=new Scanner(System.in);
        System.out.println("Limitinizi Giriniz");
        int limit= input.nextInt();
        int[] arr=new int[limit];

        for (int i = 0; i <limit ; i++) {

            System.out.println("İndex "+i+". değeri giriniz");
            arr[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("lütfen silmek istediğiniz değeri giriniz");
        int indexSil=input.nextInt();

        int [] arr2= new int[limit-1];
        int idx=0;

        for (int i = 0; i < limit; i++) {

            if (i!=indexSil){
                arr2[idx]=arr[i];
                idx++;
            }

        }
        System.out.println(Arrays.toString(arr2));




    }
}
