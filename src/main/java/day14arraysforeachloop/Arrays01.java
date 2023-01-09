package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //String array oluşturun içine 5 eleman ekle ilk elamna ile son elemanın içerdiği karakter
        // sayıları toplamını ekrana yazdır

        String arr[]=new String[5];
        arr[0]="math";
        arr[1]="science";
        arr[2]="music";
        arr[3]="englısh";
        arr[4]="art";
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length() + arr[arr.length-1].length());

        //String array oluşturun içine 5 eleman ekle tüm elemanların içerdiği karakter
        // sayıları toplamını ekrana yazdır

        //1 yol for-loop
        int totalChar=0;

        for(int i=0; i<arr.length; i++){

            totalChar = totalChar + arr[i].length();


        }
        System.out.println(totalChar);

        //2.yol: for-each-loop
int sum=0;

        for(String w: arr){
            sum = sum + w.length();
        }
        System.out.println(sum);


        System.out.println(arr[2].length() );

    }
}
