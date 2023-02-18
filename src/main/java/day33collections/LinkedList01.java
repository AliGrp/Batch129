package day33collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    /*
       1)Interface'lerden object olusturulamaz cunku interface'lerin constructor'ı yoktur.
       2)Abstract Class'larda object olusturulamaz,constructor'lari vardir  ama constructor object olusturmakta kullanılamaz.
       3)Interface'lerin constructor'lari olmadıgından collection olusturuken interface isimleri "new" keyword'undan sonra kullanılamaz.
       4)class     --> class     ==> extends
         class     --> interface --> implements
         interface --> interface --> extends
         interface --> class     --> Bu munkun degildir.

       5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar o yuzden eleman silme ve ekleme islemleri coklukla
          yapilacaksa ArrayList kullanmak tavsiye edilmez.

       6)LinkedList'lerde eleman yerine "Node" kelimesi kullanilir. En bastaki Node'a "Head", en sondaki Node'a "Tail" denir.

       7)LinkedList'ler yapiları dolayisiyla index kullanmadıklarından, eleman silmede ve eklemede re-index yapilmasına gerek yoktur.
         Bu da LinkedList'leri eleman ekleme ve silmede çok başarılı hale getirir, bu yüzden eleman ekleme ve silmenin çok yapılması
         gereken durumlarda LinkedList kullanmak tavsiye edilir.

         8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
            bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.
 */
    public static void main(String[] args) {

        List<String> cityNames = new LinkedList<>();

        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Carl");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        System.out.println("names = " + names);//names = [Steve, Carl, Raj, Megan, Brandon]

        names.addFirst("Cuneyt");
        names.addLast("Ajda");
        System.out.println("names = " + names);//names = [Cuneyt, Steve, Carl, Raj, Megan, Brandon, Ajda]

        names.add(2,"Suleyman");
        System.out.println("names = " + names);//names = [Cuneyt, Steve, Suleyman, Carl, Raj, Megan, Brandon, Ajda]

//        names.clear();
//        System.out.println("names = " + names);//names = []

            names.set(5,"Ajda");

            names.remove("Ajda");//ilk ajdayi silerr
            names.remove(2);
        System.out.println("names = " + names);//names = [Cuneyt, Steve, Carl, Raj, Brandon, Ajda]

            names.add("Suleyman");
           String r1 = names.remove();//sadace ilk elementi siler
        System.out.println("r1 = " + r1);
        System.out.println("names = " + names);

        names.add(3,"Suleyman");
        System.out.println("names = " + names);//names = [Steve, Carl, Raj, Suleyman, Brandon, Ajda, Suleyman]

        names.removeFirstOccurrence("Suleyman");//Ilk gorunumdeki  suleymani siler
        System.out.println("names = " + names);//names = [Steve, Carl, Raj, Brandon, Ajda, Suleyman]

        names.removeLastOccurrence("Suleyman");//names = [Steve, Carl, Raj, Brandon, Ajda]
        System.out.println("names = " + names);

        String r2 =names.peek();//ilk elemani listeden silmeden verir
        // remove() ile peek() arasındaki fark ==> remove() ->remove siler ve gosterir   peek()-> gosterir silmez
        System.out.println("r2 = " + r2);//Steve
        System.out.println("names = " + names);//names = [Steve, Carl, Raj, Brandon, Ajda]


        //Bos linkedlistte remove method hata verir
        //Poll bas linkedlistte null verir
        names.poll();//cut-paste Ilk elemani siler

        //removefirst ile aynidir
        //ilk elemani siler
        names.pop();//cut-paste










    }
}
