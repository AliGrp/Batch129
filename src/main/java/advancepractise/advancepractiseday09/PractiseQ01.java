package advancepractise.advancepractiseday09;

import java.util.Arrays;

public class PractiseQ01 {
    public static void main(String[] args) {
        //Bir array içerisindeki elementleri tekrarsız yazdıran bir kod yazınız.

        int arr[]={5,5,10,20,20,30,30,40,50,50,60,60};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        int idx=0;

        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i]!=arr[i+1]){
                arr[idx]=arr[i];
                idx++;
            }

        }
        arr[idx]=arr[arr.length-1];
        idx++;

        System.out.println(Arrays.toString(arr));

        int[] arrTekrarsiz = new int[idx];

        for (int i = 0; i <idx ; i++) {

            arrTekrarsiz[i]=arr[i];
        }
        System.out.println(Arrays.toString(arrTekrarsiz));
    }
}
