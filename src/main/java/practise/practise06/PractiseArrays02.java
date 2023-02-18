package practise.practise06;

import java.util.Arrays;

public class PractiseArrays02 {
    public static void main(String[] args) {

        // Ex: [0,2,3,0,12,3] sıfırları en sona koyunuz [2,3,12,0,0,0]

        int a[] ={0,2,3,0,12,3};
        int b[] =new int[a.length];
        System.out.println(Arrays.toString(a));

        int idx =0;
        for (int w:a) {
            if (w!=0){
                b[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));




    }
}
