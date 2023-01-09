package day20list;

import java.util.ArrayList;
import java.util.List;

public class PractiseList04 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        System.out.println(names);

        List<String> females = new ArrayList<>();

        females.add("Ajda");
        females.add("Emel");
        //names.containsAll(females) "names" listonde "females" tum elemanlarin var olup olmadigini kontrol eder
        // Tamami varsa size true verir herhangi biri yoksa false verir

       boolean r = names.containsAll(females);
        System.out.println(r);

        List<String> sublist= names.subList(0,3);
        System.out.println(sublist);


        List<String> electronics=new ArrayList<>();
        electronics.add("Tv");
        electronics.add("Radio");
        electronics.add("Refrigarator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods=new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("Tv");

        electronics.retainAll(homeGoods);
        System.out.println(electronics);

        names.retainAll(females);
        System.out.println(names);
    }
}
