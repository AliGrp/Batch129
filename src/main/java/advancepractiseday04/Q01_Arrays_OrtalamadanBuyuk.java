package advancepractiseday04;

import practise10.Arrays;

public class Q01_Arrays_OrtalamadanBuyuk {
    public static void main(String[] args) {
        //Verilen bir Array'in elementlerinin ortalamasından büyük elementleri yazdıran bir kod yazınız.

        int[] arr = {35, 61, 22, 17, 11, 0};

        int toplam = 0;
        for (int w : arr) {
            toplam = toplam + w;
        }


        int ortalama = toplam / arr.length;
        System.out.println("ortalama = " + ortalama);

        System.out.print("Ortalamadan buyuk elementler");
        for (int w : arr) {
            if (w > ortalama) {
                System.out.print(w);
            }
        }
    }
}
