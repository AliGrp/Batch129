package day20list;

import java.util.ArrayList;
import java.util.List;

public class PractiseList01 {
    public static void main(String[] args) {
        //Example 1: Integer bir list olusturun
        //Liste 5 eleman ekleyin
        // Bu elemanlardan 12yi siliniz

        List<Integer> nums= new ArrayList<>();
        nums.add(34);
        nums.add(11);
        nums.add(12);
        nums.add(22);
        System.out.println(nums);

       // Integer sayi=12;
       // nums.remove(sayi);
       // System.out.println(nums);

        nums.remove((Integer)34);//tavsiye edlilen
        System.out.println(nums);

       // System.out.println(nums.indexOf(11));

        //nums.remove(Integer.valueOf(12));
        //System.out.println(nums);


    }
}
