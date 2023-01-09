package day16arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {
        //Ex 1: String Array elemanlarını character sayısına göre göre küçükten büyüğe sıralayınız
        // ["Micheal" "Ajda" "Thomas" "Tom"]

        String arr[]={"Micheal", "Ajda", "Thomas", "Tom"};
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));


        //Ex 1: String Array elemanlarını character sayısına göre göre büyükten küçüğe sıralayınız
        // ["Micheal" "Ajda" "Thomas" "Tom"]

        String brr[]={"Micheal", "Ajda", "Thomas", "Tom"};
        Arrays.sort(arr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));

        //Ex 1: String Array elemanlarını character sayısına göre alfabetik sıralayınız
        // ["Micheal" "Ajda" "Thomas" "Tom" "Ali" "Cin" "Gabriel" "Reyhane" "Cem" "Ayhan"]

        String crr[]={"Micheal", "Ajda", "Thomas", "Tom", "Ali", "Cin", "Gabriel", "Reyhane", "Cem", "Ayhan"};


        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));

        System.out.println(Arrays.toString(crr));












    }
}
