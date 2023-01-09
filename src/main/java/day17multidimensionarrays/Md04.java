package day17multidimensionarrays;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {

        //Bir multi-dimensioanal array oluşturunuz ve
        // bir Md'li arraya dönüştürün
        int a[][]={{2,5},{3},{4,7,11}};

        // "a" Arraydaki toplam eleman sayıısını bulunuz.

        int totalElement=0;
        for(int []w:a){
        totalElement =totalElement+ w.length;
        }
        // "b" isimli tek DM array olusturunuz
        int b[]=new int[totalElement];
        System.out.println(totalElement);

        int idx =0;
       for(int[] w : a){

        for(int k:w) {
            b[idx] = k;
            idx++;
        }
    }
        System.out.println(Arrays.toString(b));



    }
}

