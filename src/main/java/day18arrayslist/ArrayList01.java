package day18arrayslist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {
    public static void main(String[] args) {

        //list oluşturma:
        ArrayList<Integer>ages=new ArrayList<>();
        System.out.println(ages);

        // listlere nasıl eleman eklenşr
            //list'e elaman eklemek içib add() methodunu kulllanırz
            // add() methodunu elemanları sizin vediğiniz sırada liste ekler(insertion)

        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(888);

        ages.add(1,656);
        ages.add(3,776);

        System.out.println(ages);

        //List'e çoklu eleman nasıl eklenir? başka bir lşst nsıl eklenir
            // addAll methodu

        ArrayList<Integer> newAges= new ArrayList<>();
        newAges.add(8);
        newAges.add(3);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2,newAges);
        System.out.println(ages);//[9,956,8,3,10,12,776,10,888,8,3,10]

        //  Bir listteki elemanları nasıl silebilirim
       // ages.clear();
        //System.out.println(ages);


        // contains() mothodu Listte olup olmadığını kontrol eder?
         boolean r=ages.contains(10);
         System.out.println(r);


         // bir listin başka bir list ile aynı olup olmadığını nasıl kontrol ederiz
            // iki listin eşit olabilmesi için aynı indexte aynı elemanlar olmalı

        ArrayList<String> names = new ArrayList<>();
        names.add("tom");
        names.add("jim");
        names.add("kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("tom");
        names2.add("jim");
        names2.add("kim");

        boolean s =names.equals(names2);
        System.out.println(s);

        //Ex_1: Verilen iki Integer Lıstte tamamıyla aynı elemanların olup olmadığını kontrol eden kodu yazınız

        ArrayList<Integer> nums1= new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2= new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);// elemanları küçükten büyüğe dizdi
        Collections.sort(nums2);// listler collections yapısının bir parçasıdır

        boolean n = nums1.equals(nums2);
        System.out.println(n);

    }
}
