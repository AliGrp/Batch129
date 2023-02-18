package day38lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<Double>mylist = new ArrayList<>();
        mylist.add(12.0);
        mylist.add(4.0);
        mylist.add(7.0);
        mylist.add(3.6);
        mylist.add(26.8);
        mylist.add(38.4);
        mylist.add(26.8);

        List<Double> half =getHalfElementsGreaterThanFiveDistcintReverse(mylist);
        System.out.println("half = " + half);

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jone");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

        printAllAlphabeticallyUpperDistinct(list);
        System.out.println();

        printAllAlphabeticallyLowerDistinct(list);
        System.out.println();

        printAllSortWithLengthUpperDistinct(list);
        System.out.println();

        printAllSortWithLastCharUpperDistinct1(list);
        System.out.println();

        printAllSortLengthUpperDistinctSameLengthsInAlphaticalOrder(list);
        System.out.println();

        //System.out.println(removeElementIfTheLengthGreaterThanFive(list));

        System.out.println(removeElementIfStartsWithAorEndsWith(list));
        System.out.println();

        System.out.println(printLengthSquare(list));
        System.out.println();

        System.out.println(printElementsLengthEven(list));
    }
//Example 1: Create a method to find the half of the elements greater than 5, distinct, in reverse order, in a list.

    public static List<Double> getHalfElementsGreaterThanFiveDistcintReverse(List<Double>mylist){
       return mylist.
               stream().
               distinct().
               filter(t->t>5).
               map(t->t/2).
               sorted(Comparator.reverseOrder()).
               collect(Collectors.toList());

    }

    //Tum list elemanlari buyuk harfle alfabetik sirada tekrarsiz olarak yazdiriniz

    public static void printAllAlphabeticallyUpperDistinct(List<String> list){
        list.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t+" "));
    }
    //Tum list elemanlari kucuk harfle alfabetik siranin tersinde tekrarsiz olarak yazdiriniz

    public static void printAllAlphabeticallyLowerDistinct(List<String> list){
        list.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.reverseOrder()).
                forEach(t-> System.out.print(t+" "));
    }
    //Tum list elemanlari buyuk harfle uzunluklarina gore artan sirada tekrarsiz olarak yazdiriniz

    public static void printAllSortWithLengthUpperDistinct(List<String> list){
        list.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));

    }
    //Tum list elemanlari buyuk harfle son harflerine gore ARTAN sirada tekrarsiz olarak yazdiriniz

    public static void printAllSortWithLastCharUpperDistinct1(List<String> list){
        list.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(Utils::getLastChar).reversed()).
                forEach(System.out::print);
    }
    //Tum list elemanlari buyuk harfle uzunluklarina gore artan sirada tekrarsiz olarak yazdiriniz
    //Uzunluklari ayni sirada olan elemanlar alfabetik sirada olsunlar

    public static void printAllSortLengthUpperDistinctSameLengthsInAlphaticalOrder(List<String> list){
        list.
                stream().
                distinct().
                map(String::toUpperCase).//Method reference
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(Utils::printInTheSameLineWithSpace);
    }

    //Karakter sayisi 5den fazla olan elemanlari siliniz

//    public static List<String> removeElementIfTheLengthGreaterThanFive(List<String> list){
//        list.
//                removeIf(t->t.length()>5);
//        return list;
//
//    }

    //"A" ile baslayan veya "d" ile bitane elemanlari siliniz

    public static List<String> removeElementIfStartsWithAorEndsWith(List<String> list){
        list.
                removeIf(t->t.startsWith("A")||t.endsWith("d"));
        //Bazen "stream()" methodu bize lazim olan methodlara ulasmamiza engel olur. Bu yüzden "stream()" methodunu kullanmayız
    //"removeIf()" methodunda olduğu gibi.

    //Fakat "stream()" methodunu daha sonradan kullanmamız gerekibilir. Bu durumda "stream()" methodunu kullanarak istediğimiz methodlara
    //ulasiriz, distinct() methoduna ulaştığımız gibi.

    // sonuc bize list olarak lazımsa "collect(Collectors.toList()" ile sonucu List'e ceviririz
        return list.stream().distinct().collect(Collectors.toList());
    }


    //Example 9:List elemanlarini karakter sayilarinin karelerini aliniz ve bir list olarak ekrana yazdiriniz
    public static List<Integer>printLengthSquare(List<String>list){
        return list.
                stream().
                map(Utils::getLengthSquare).
                collect(Collectors.toList());

    }


    //Example 10: List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz
    public static List<String>printElementsLengthEven(List<String>list){
        return list.
                stream().
                filter(Utils::isEven).
                collect(Collectors.toList());
    }



}
