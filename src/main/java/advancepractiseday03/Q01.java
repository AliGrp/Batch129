package advancepractiseday03;

import java.util.Arrays;

public class Q01 {
    public static void main(String[] args) {
         /*
            SORU 1: Verilen 3 elemanli bir array'in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
                    ORNEK ==> array[1,2,3} ise output [2,3,1}
         */

        int names[]={1,3,2,5,7};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        //System.out.println(Arrays.toString(names));



        int anames[]=new int[names.length];

        int idx=0;
        for (int i = names.length-1; i >= 0 ; i--) {
            anames[idx]=names[i];
            idx++;



        }
        System.out.println(Arrays.toString(anames));
    }
}
