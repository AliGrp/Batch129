package practise10;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        System.out.println("a= "+a);
        a.remove("Shoes");
        System.out.println("a= "+a);

        List<String> myNames = new ArrayList<>();
        myNames.add("Burcu");
        myNames.add("Can");
        myNames.add("Zisan");
        myNames.add("Emre");
        myNames.add("Bilal");
        myNames.add("Gul");

        List<String> varmi = new ArrayList<>();
        varmi.add("Burcu");
        varmi.add("Gul");
        varmi.add("Can");



        boolean sonuc =myNames.containsAll(varmi);
        System.out.println(sonuc);
    }
}
