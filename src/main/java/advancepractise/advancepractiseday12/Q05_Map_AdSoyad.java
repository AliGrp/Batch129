package advancepractise.advancepractiseday12;

import java.util.HashMap;
import java.util.Map;

public class Q05_Map_AdSoyad {
    /*
      İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
          input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
          output : {John=Doe, Mark=Twain, Ali=Can};
       */

    public static void main(String[] args) {

        String[] ad= {"John", "Mark", "Ali","Mehmet"};
        String[] soyAd=  {"Doe", "Twain", "Can","Adem"};
        int[] yas={5,6,7,8};
        Map<String,String> adSoyad = new HashMap<>();

        for (int i = 0; i <ad.length ; i++) {
            adSoyad.put(ad[i],soyAd[i]);
        }
        System.out.println("adSoyad = " + adSoyad);
    }
}
