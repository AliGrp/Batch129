package day37lambda;

import java.util.ArrayList;
import java.util.List;

public class Exercise02 {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        tekSayiKare(nums);


    }
// Bir listteki tek sayi olan elemanlarin karelerin i ayni satirda aralarina bosluk koyarak yazdiran
// methodu olusturun(Functional).

    public static void tekSayiKare(List<Integer> nums){

        nums.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.println(t+" "));

    }


}
