package practise.practise11;

import java.util.Arrays;

public class MD04 {
    public static void main(String[] args) {
        //Bir multi-dimensioanal array oluşturunuz ve
        // bir Md'li arraya dönüştürün
        int a[][]={{2,5},{3},{4,7,11}};


        int totalElement=0;
        for (int[] w:a) {
            totalElement=totalElement+w.length;

        }
        int b[]=new int[totalElement];

        int idx=0;
        for (int[] w:a) {
            for (int k:w) {
                b[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
