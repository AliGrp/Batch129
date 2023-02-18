package advancepractise.advancepractiseday13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q02_Map_Aile {

    public static void main(String[] args) {
        //Ad-Soyad-Yaş ve kardeşler listesini tek bir Map içerisinde saklayan bir kod yazınız.


        Aile aile = new Aile("Ali","Can",12,"Ahmet","Hayriye");
        System.out.println("aile.getAileMap() = " + aile.getAileMap());

        Aile veli = new Aile("Veli","Han",15,"Mehmet","Hatice","Huseyin");
        System.out.println("veli.getAileMap() = " + veli.getAileMap());

        Aile ayse = new Aile("Ayşe","Kan",35,"Fatma");
        System.out.println("ayse = " + ayse);
    }



}
