package day37lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    /*

            1)Lambda "Functional programming" dir, digeri "Structured Programming"
            2)"Functional programming" "Ne yapmak gerekir?(What to do?)" ile ilgilenir "Nasil yapmak gerekir?(How to do?)" ile ilgilenmez.
            3)"Functional programming" Collection'lar ve Array'lerde kullanilir.
            4)Lambda, Java'ya "Java 8"de eklendi.

            "stream()" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir.
            "filter()" filtrelemek icin kullanilir.
            "map()" u var olan elemani degistirmek icin kullanilir.
            "distinct()" u tekrarli elemanlari sadece bir kere gosterir ve tekrarsizlari olduklari kadar gosterir.
            Note : Distinct methodu ilk baslara konulursa "Lambda" ya daha az is yaptirmis oluruz.
            "reduce()" u  kullanildiginda cok sayidaki deger bir tane degere donusmus olur.
            Orn; reduce(0,(t,u)->t+u) ==> "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
            "u" ise degerlerini her zaman "stream" den alir
            get()==> methodu optional data type'ini Integer'a cevirir.
 */

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

        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);

        System.out.println();
        printSquareOfOddElements(nums);

        System.out.println();
        printCubeOfDistincOddElements(nums);

        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums);

        System.out.println();
        printCubeSumOfSquaresOfDistinctEvenElements(nums);

        System.out.println();
        getMaxValue(nums);

        System.out.println();
        getMaxValue2(nums);

        System.out.println();
        getMinValue(nums);

        System.out.println();
        getMinValue1(nums);

        System.out.println();
        getMinValue2(nums);

        System.out.println();
        getMinValue3(nums);

        System.out.println();
        getMinGreaterThanSevenEven(nums);


    }
    //1)Create a method to print the list elements on the console in the
    // same line with a space between two consecutive elements.(Structured)
    //1)Konsoldaki liste elemanlarını, ardışık iki eleman arasında boşluk
    // bırakarak aynı satıra yazdırmak için bir method oluşturun.

    //Bir List'teki elemanlari ayni satirda bosluk koyarak yazdiran methodu olusturunuz
    public static void printElements1(List<Integer>nums){//Structured yaptik
        for (Integer w:nums){
            System.out.print(w+" ");
        }
    }
    //Bir List'teki elemanlari ayni satirda bosluk koyarak yazdiran methodu olusturunuz
    public static void printElements2(List<Integer>nums){//Functional lambda ile
        nums.
                stream().
                forEach(t->System.out.print(t+" "));
    }

    //3)Create a method to print the "even" list elements on the console in the same line with a space
    // between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void printEvenElements1(List<Integer>nums) {

        for (Integer w:nums) {
            if (w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    //4)Create a method to print the "even" list elements on the console in the same line with a space
    // between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printEvenElements2(List<Integer>nums){
        nums.
                stream().
                filter(t->t%2==0).
                forEach(t->System.out.print(t+" "));
    }

//5)Create a method to print the square of odd list elements
// on the console in the same line with a space between two consecutive elements
    public static void printSquareOfOddElements(List<Integer>nums){
        nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).//map() methodu varolan elemani "update" etmek icin kullanilir
                forEach(t-> System.out.print(t+" "));
    }

    //6)Create a method to print the "cube" of "distinct" "odd" list elements on the console
    // in the same line with a space between two consecutive elements.
    //  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini tekrarsiz olarak ayni satirda aralarina
    //  bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOfDistincOddElements(List<Integer>nums){
        nums.
                stream().
                filter(t->t%2!=0).
                distinct().
                map(t->t*t*t).
                forEach(t-> System.out.print(t+" "));

        //distinct() methodu list'te tekrar eden elemenlari tekrarsiz aldirir.
        //distinct() methodu stream() method'undan sonra almak eleme yapilacak elemani basta almamiza
        // ve method'un hızlı calismasina neden olur.

    }

    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer>nums){
        Integer sum =nums.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(sum);//456
    }
//8)Create a method to calculate the "product" of the "square" of "distinct" "even" elements

public static void printCubeSumOfSquaresOfDistinctEvenElements(List<Integer>nums){
        Integer product = nums.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).
                reduce(1,(t,u)->t*u);

    System.out.println(product);
}

//9)Create a method to find the "maximum value" from the list elements
    public static void getMaxValue(List<Integer>nums){
      Integer max =  nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE,(t,u)->t>u ? t:u);//max ariyorsaniz baslangic degerini min yapin
        System.out.println(max);
    }

    //2.Yol
    public static void getMaxValue2(List<Integer>nums) {
        Integer max =  nums.
                stream().
                distinct().
                sorted().
                reduce((t,u)->u).get();//max ariyorsaniz baslangic degerini min yapin
        System.out.println(max);
    }


    //10)Create a method to find the minimum value from the list elements
    public static void getMinValue(List<Integer>nums){

        Integer min =nums.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->t>u ? u : t);
        System.out.println(min);
    }

    //2.yol
    public static void getMinValue1(List<Integer>nums){

        Integer min =nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t,u)->u).get();
        System.out.println(min);
    }

    //3.yol
    public static void getMinValue2(List<Integer>nums){

        Integer min =nums.stream().distinct().sorted().reduce((t,u)->t).get();
        System.out.println(min);
    }
    //4.yol
    public static void getMinValue3(List<Integer>nums){

        Integer min =nums.stream().distinct().sorted().reduce((t,u)->Math.min(t,u)).get();
        System.out.println(min);
    }

    //MIN 7 DEN BUYUK VE CIFT OLUP EN KUCUGU BULL
    //

    public static void getMinGreaterThanSevenEven(List<Integer>nums){
        Integer min =nums.
                stream().
                filter(t->t>7 && t%2==0).
                sorted().
                reduce((t,u)->t).
                get();
        System.out.println(min);//10
    }
    }






