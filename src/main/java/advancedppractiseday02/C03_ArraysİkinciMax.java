package advancedppractiseday02;

import java.util.Arrays;

public class C03_ArraysİkinciMax {
    public static void main(String[] args) {
        //Array içerisinde minumum ve maximum değerleri bulan kodu yazınız

        int[] arr= {100,10,-90,845,-8787,898,0,1};

        //1.YOL:

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));// natural order küçükten büyüğe
        System.out.println("min= "+arr[0] +"  Max= " +arr[arr.length-1] + " secMax= "+arr[arr.length-2]);

        //2.YOL

        int min= arr[0];
        int max= arr[0];
        int secMax= arr[0];

        for (int w:arr) {
            if(w<min){
                min = w;
            } else if (w>max) {
                secMax = max;
                max =w;

            } else if (w>secMax) {
                secMax = w;

            }

        }
        System.out.println("min= "+min + " max= "+max + " secMax= " + secMax);
    }
}
