package day20list;

import java.util.*;

public class List01 {
    public static void main(String[] args) {
        //Example 1: Integer bir list olusturun
        //Liste 5 eleman ekleyin
        // Bu elemanlardan 12yi siliniz

        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);

        //1.Yol:
        //Integer sayi=12; // variable kullandik memoryde yer kullandik
        //ages.remove(sayi);

        //2.Yol
        //ages.remove((Integer)12 );//tavsiye edilen

        //3.Yol
        //ages.remove(Integer.valueOf(12));//2 method kullanildi

        //4.Yol:
        //ages.remove(ages.lastIndexOf(12));// 2 2method kullanildi
        System.out.println(ages);

        List<Integer>silinecekler= new ArrayList<>();
        silinecekler.add(12);
        silinecekler.add(25);
            //removeAll methodu ile calisir
            //remmoveAll Methodu bir veya birden fazla elamin tum gorunumlerini silmek icin kullanilir
        ages.removeAll(silinecekler);
        System.out.println(ages);


    }
}