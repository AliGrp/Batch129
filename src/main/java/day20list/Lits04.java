package day20list;

import java.util.ArrayList;
import java.util.List;

public class Lits04 {
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
        boolean r= names.containsAll(females);
        System.out.println(r);
    //SubList(1,4) "names" listindeki index'i 1,2, ve 3 olan elemanlari bir List'in icinde verir
    // Ikinci index olan 4 dahil degildir
       List<String> sublist = names.subList(1,4);
        System.out.println(sublist);//[Cuneyt, Mahsun, Muslum]

        //degisecek olan ilk listtir ikinci listte dokunmaz
        names.retainAll(females);
        System.out.println(names);//Ajda
        System.out.println(females);//Ajda Emel

        //Example 1: Elektronik aletler ve ev aletleri listiniz var
        //           Elektronik ev aletlerini siralayin

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

        homeGoods.retainAll(electronics);
        System.out.println(homeGoods);//[Radio, Tv]

        names.isEmpty(); //Listte eleman yoksa "true" verir listte eleman varsa "false" verir

        System.out.println(names.hashCode());//2041509
    }
}
