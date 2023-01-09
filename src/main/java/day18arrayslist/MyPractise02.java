package day18arrayslist;

import java.util.ArrayList;
import java.util.List;

public class MyPractise02 {
    public static void main(String[] args) {
        // ArrayList oluştururken sağ tarafa (constructor) ArrayList yazmak
        // zorundasınız. Ama sol tarafa ister Arraylist ister list yazın farketmez

        List<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //  Bir elementte kaç eleman olduğunu nasıl anlarız
        int sze= initials.size();
        System.out.println(sze);

        // Bir listten istenen bir eleman nasıl alınır

        char u= initials.get(initials.size()-1);
        char s=initials.get(0);
        System.out.println(u+" "+s);

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("İstanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        cities.set(0,"bok");
        System.out.println(cities);

        int sum =0;

        for (String w:cities
             ) {
            sum=sum+w.length();

        }
        System.out.println(sum);


        int toplam=0;
        for (int i = 0; i <cities.size() ; i++) {
            toplam=toplam+cities.get(i).length();
        }
        System.out.println(toplam);

        //Maaş listi oluşturunuz ve maaşlara %20 zam yapınız

        List<Double> salary= new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);

      int idx=0;

        for (double k :salary) {

            salary.set(idx,k*1.20);
            idx++;


        }
        System.out.println(salary);



    }
}
