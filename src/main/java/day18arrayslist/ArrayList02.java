package day18arrayslist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        // ArrayList oluştururken sağ tarafa (constructor) ArrayList yazmak
        // zorundasınız. Ama sol tarafa ister Arraylist ister list yazın farketmez

        List<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //  Bir elementte kaç eleman olduğunu nasıl anlarız
         int numOfElement = initials.size();// arraylerde ki Stringdeki length aynı görevdedir.
        System.out.println(numOfElement);


        // Bir listten istenen bir eleman nasıl alınır
        char u = initials.get(0);
        System.out.println(u);// A

        //Ex: Verilen bir String Listteki tüm elemanların  toplam karakter sayısını bulan kodu yazınız

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("İstanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        //1.Yol:Recomended(tavsiye edilen)

        int sum = 0;

        for (String w:cities
             ) {
            sum=sum+w.length();

        }
        System.out.println(sum);

        //2.Yol:
        int toplam =0;
        for (int i = 0; i < cities.size(); i++) {

            toplam= toplam + cities.get(i).length();

        }
        System.out.println(toplam);

        //Bir Listteki istenen bir elemanı nasıl değiştirebiliriz

        cities.set(0,"New York");
        System.out.println(cities);

            //Ex_2:
        //Maaş listi oluşturunuz ve maaşlara %20 zam yapınız

        List<Double> salary= new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);


        //1'inci Yol: for-each
        int idx=0;
        for (double w:salary
             ) {
            salary.set(idx,w*1.20);// idx 0 demek sıfırıncı indextekinin yerine değeri yaz

            idx++;

        }
        System.out.println(salary);

        // 2'nci Yol : for-i

        for (int i = 0; i < salary.size() ; i++) {

            salary.set(i,salary.get(i)*1.20);

        }
        System.out.println(salary);

        cities.set(0,"bok");
        System.out.println(cities);







    }
}
