package practise.practise09;

import java.util.Arrays;

public class ArraysPractise01 {
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

        int sum=0;

        for (String w:arr) {
            sum=sum+w.length();

        }
        System.out.println(sum);

        int total=0;
        for (int i = 0; i < arr.length ; i++) {
            total=total+arr[i].length();

        }
        System.out.println("toplam 2.yol= "+total);


    }
}
