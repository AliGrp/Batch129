package day37lambda;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        ekle(nums);
        System.out.println();

        ciftSquared(nums);
        System.out.println();

        tekCube(nums);
        System.out.println();

        toplam(nums);
        System.out.println();

        maxAl(nums);
        System.out.println();


        minAl(nums);
        System.out.println();


    }

    public static void ekle(List<Integer>nums){
        nums.stream().forEach(t-> System.out.print(t+" ! "));
    }

    public static void ciftSquared(List<Integer>nums){

        nums.
                stream().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                forEach(t-> System.out.print(t+" !"));

    }

    public static void tekCube(List<Integer>nums){
        nums.
                stream().
                filter(t-> t%2!=0).
                distinct().
                map(t->t*t*t).
                forEach(t-> System.out.print(t+" !"));
    }

    public static void toplam(List<Integer>nums){
        Integer sum = nums.
                stream().
                filter(t->t%2==0).
                distinct().
                map(t->t*t).
                reduce(0,(t,u)->t+u);
        System.out.println(sum);

    }

    public static void maxAl(List<Integer>nums){
        Integer max = nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE,(t,u)->t>u ? t : u);
        System.out.println(max);
    }

    public static void minAl(List<Integer>nums){
        Integer min = nums.
                stream().
                reduce(Integer.MAX_VALUE,(t,u)->t<u ? t : u);
        System.out.println(min);

    }
    }
