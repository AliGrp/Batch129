package advancepractiseday06;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays_IstenenleriSilme {
    public static void main(String[] args) {
        //Bir  integer Array'de verilen bir deger disindaki elamanlari  yeni bir Array olarak yazdiran bir method yazýnýz.
        int[] arr ={1,2,2,3,4,5,5};
        System.out.println(Arrays.toString(isteneniSil(arr)));

    }

    public static int[] isteneniSil(int[] arr){
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.println("Silmek istediginiz elemani giriniz");
        int silinecek = input.nextInt();

        int length = 0;

        for (int w:arr) {
            if (w!=silinecek){
                length++;

            }

        }
        System.out.println("length = " + length);
        int[] arrSilinmis = new int[length];

        int idx =0;
        for (int w:arr) {
            if (w!=silinecek){
                arrSilinmis[idx]=w;
                idx++;

            }

        }
        return arrSilinmis;
    }
}
