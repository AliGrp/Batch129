package day39lambda;

import lambdapractise.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println("getSumOfAllElements(myList) = " + getSumOfAllElements(myList));

        System.out.println("yedienYetmise = " + yedienYetmise());

        System.out.println("ucdenDokuza() = " + ucdenDokuza());

        System.out.println("faktoriyel() = " + faktoriyel(10));

        System.out.println("toplamini() = " + toplamini(19,3));

        System.out.println("rakamTopla() = " + rakamTopla(11,17));

    }
    //Example 1: Verilen list'teki tum sayilarin toplamini veren method'u olusturunuz.
    public static int getSumOfAllElements(List<Integer> myList){
        return myList.
                stream().
                reduce(Math::addExact).
                get();
    }
    //2) 7 den 70e kadar tum sayilarin toplamini veren kodu yaziniz

    public static int yedienYetmise(){
       return IntStream.
               rangeClosed(7,70).
               reduce(Math::addExact).
               getAsInt();

    }
    //3 den 9a kadar tum tam sayilarinin carpimini veren methodu olustur

    public static int ucdenDokuza(){
        return IntStream.
                rangeClosed(3,9).
                reduce(Math::multiplyExact).
                getAsInt();
    }
    public static int ucdenDokuza2(){
        return IntStream.
                range(3,10).//bunda ise bir fazlasini vermemiz gerekiyor o yuzden 10 yaptik 3 dail 10 haris
                reduce(Math::multiplyExact).
                getAsInt();
    }

    //SIze verilen sayinin faktoriyelini hesaplayan kddu yaziniz

    public static int faktoriyel(int x){
        if (x==0){
            return 1;
        } else if (x<0) {
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        }else
        return IntStream.
                rangeClosed(1,x).
                reduce(Math::multiplyExact).
                getAsInt();
    }
    //Size verilen iki tamsayi arasindaki tum cift sayilarin toplani veren kodu yaziniz

    public static int toplamini(int a,int b){
        if (a>b){
            int temp =a;
            a=b;
            b=temp;
        }
        return IntStream.
                range(a+1,b).filter(Utils::ciftSayi).
                sum();

    }

    //iki tam sayi arasinda sayilarin rakamlari toplamini yaz

    public static int rakamTopla(int a, int b){
        if (a>b){
            int temp =a;
            a=b;
            b=temp;
        }
        return IntStream.
                range(a+1,b).
                map(Utils::getSumOfDigits).
                sum();
    }
}
