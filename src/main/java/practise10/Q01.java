package practise10;

import java.util.ArrayList;
import java.util.List;

public class Q01 {
    public static void main(String[] args) {
        // 1)ArrayList nasil olusturulur?
        List<Integer> nums = new ArrayList<>();

        // 2)ArrayListler nasil yazdirilir?
        System.out.println(nums);//[]

        nums.add(37);
        nums.add(38);
        nums.add(39);
        nums.add(40);
        nums.add(41);
        nums.add(42);
        System.out.println("nums = " + nums);  //nums = [37, 38, 39, 40, 41, 42]

        // 3) ArrayList'in bos olup olmadigini nasil anlariz?
        boolean bosmu1 = nums.isEmpty();
        System.out.println("bosmu1 = " + bosmu1);//false

        List <Integer> ages = new ArrayList<>();
        boolean bosmu2 = ages.isEmpty();
        System.out.println("bosmu2 = " + bosmu2);//bosmu2 = true

        //Example 1: nums ArrayList'indeki tum tek sayilari 11
        // artirdiktan sonra ekrana yazdiriniz

        for (int w:nums) {
            if (w%2 !=0){
                nums.set(nums.indexOf(w), w+11 );
            }

        }
        System.out.println("nums= "+nums);

        //Ex nums ArrayListinden 52 rakaminin ilk gorunumunu silin


        nums.add(4,45);
        nums.add(nums.size(), 65);
        nums.add(36);

        System.out.println(nums);
        nums.remove(nums.indexOf(52));
        System.out.println(nums);

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println("names= "+names);

        List<String> emekliOlacaklar= new ArrayList<>();
        emekliOlacaklar.add("Thomas");
        emekliOlacaklar.add("Tahsin");
        emekliOlacaklar.add("Trump");

        names.removeAll(emekliOlacaklar);
        System.out.println("emekli olacaklar "+emekliOlacaklar);
    }
}
