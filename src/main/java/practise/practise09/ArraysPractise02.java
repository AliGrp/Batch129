package practise.practise09;

import java.util.Arrays;

public class ArraysPractise02 {
    public static void main(String[] args) {
        // ınteger array oluşturunuz
        //içie 6 eleman yerleştir
        // bu eleman ile en küçüğü en büyüğünü topalayın

        int ages[]=new int[5];
        ages[0]=18;
        ages[1]=19;
        ages[2]=25;
        ages[3]=16;
        ages[4]=24;
        System.out.println(Arrays.toString(ages));
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        //System.out.println(ages[0] + ages[ages.length-1]);

        int min=ages[0];
        int max=ages[0];
        for (int w:ages) {
            min=Math.min(min,w);
            max=Math.max(max,w);


        }
        System.out.println(min+max);
    }
}
