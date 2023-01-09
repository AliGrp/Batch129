package ssg_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int sayi[]={8,5,12,11,14};

        int sum=0;

        for (int i = 0; i < sayi.length ; i++) {
            sum+=sayi[i];

        }
        System.out.println(sum);
    }
}
