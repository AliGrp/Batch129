package day18arrayslist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("İstanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities);

        //remove() methodu index ile kullanılırsa o indexteki elamanı siler
        //remove() methodu index ile kullanılırsa size sildiği elamanı verir
        String n =cities.remove(1);
        System.out.println(cities);

        //Remove methodu eleman ile kullanılırsa ilk görünümü siler
        //Remove methodu eleman ile kullanılırsa size o elamanı silip silmediğini
        //ifade eden true veya false verir.
        //Eğer eleman listte var ise o elamnı siler ve size true eder
        //Eğer eleman listte yok ise o elmanı silemediğinden ve size false der.


        boolean p =cities.remove("Kayseri");
        System.out.println(p);
        System.out.println(cities);
    }
}
