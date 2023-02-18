package day34collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {
        //LinkedHashSet olusturma
        LinkedHashSet<String> artist = new LinkedHashSet<>();
        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Tom");//en son eklenen tomu yazdirir
        artist.add("Brad");
        artist.add("Angelina");
        System.out.println("artist = " + artist);//[Ajda, Tom, Brad, Angelina]

        LinkedHashSet<String> actress = new LinkedHashSet<>();
        actress.add("Ajda");
        actress.add("Angelina");

        artist.removeAll(actress);
        System.out.println("artist = " + artist);




    }
}
