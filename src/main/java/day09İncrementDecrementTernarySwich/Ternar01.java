package day09İncrementDecrementTernarySwich;

public class Ternar01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int r1 = a<b ? a++ : b++ ;
        System.out.println(r1);
        System.out.println(a);
        System.out.println(b);

        //verilen bir sayının mutlak değerini hesaplayan kodu yazınız
        // -4 ==>-1*-4 4==>4 0==>0

        int c = 4;
        int r2 = c<0 ? -1*c : c;
        System.out.println(r2);

        int m= -5;
        int n= 6;
        Object r3 = (m>0&&n>0)||(m<0&&n<0)? m*n:"farklı işaretli sayıları çarpmıyorum";
        System.out.println(r3);

        //size verilen sayını 3 basamaklı olup olmadığını kontrol ediniz

        int p = -436;
        int r = Math.abs(p);
        String r4 = r>99&&r<1000 ? p+ "üç basamaklıdır" : p+ "üç basamaklı değildir";
        System.out.println(r4);

    }
}
