package day17multidimensionarrays;

public class Md06 {
    public static void main(String[] args) {
        // Bır Md arraydaki en büyük ve en küçük sayının topalmını ekrana yazdırın


        int a[][]={{25,5},{3},{-7,12,8}};

        int small=a[0][0];
        int big=a[0][0];

        for (int[]w:a) {

            for (int k:w){

                small = Math.min(small,k);
                big = Math.max(big,k);


            }

        }
        System.out.println("Arraydaki en küçük eleman "+small);
        System.out.println("Arraydaki en büyük eleman "+big);
        System.out.println("Toplamı "+(big+small));


    }
}
