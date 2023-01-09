package day17multidimensionarrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        // bir md oluşturun toplam eleman sayısını konsola yazdırın

        int a[][]={{13,213,4},{12,87},{4,7,1,9},{99}};
        System.out.println(Arrays.deepToString(a));

        int num=0;
        for (int[] w : a ){
            num = num+w.length;

        }
        System.out.println(num);
    }
}
