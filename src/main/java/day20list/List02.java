package day20list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
        //Bir tane int list olusturun
        //bu listte birbirine en yakin ikki tam sayiyi yaziniz
        // [12,23,9,11,35]==>12,11

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(33);

        Collections.sort(nums);
        System.out.println(nums);

        int minDiff= nums.get(1) - nums.get(0);

        for (int i = 1; i <nums.size(); i++) {

           minDiff = Math.min(minDiff, nums.get(i) - nums.get(i-1));

        }
        System.out.println(minDiff);

        for (int i = 1; i <nums.size(); i++) {
            if (nums.get(i)-nums.get(i-1)==minDiff){
                System.out.println(nums.get(i-1)+" and "+ nums.get(i));
            }

        }

    }
}
