package practise11;

import java.util.Arrays;

public class MD01 {
    public static void main(String[] args) {
        int a[][] = new int[3][2];
        System.out.println(Arrays.deepToString(a));

        a[0][0]=15;
        a[2][0]=55;
        a[1][1]=45;
        System.out.println(Arrays.deepToString(a));

        System.out.println(Arrays.toString(a[2]));
        System.out.println(a[2][0]);

    }
}