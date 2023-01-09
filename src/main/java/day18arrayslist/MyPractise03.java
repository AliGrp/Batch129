package day18arrayslist;

import java.util.ArrayList;
import java.util.List;

public class MyPractise03 {
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

        cities.remove(2);
        System.out.println(cities);

        boolean p=cities.remove("kayseri");
        System.out.println(p);
    }
}
