package day33collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);
        System.out.println("hs = " + hs);// [5, 234, 12, 78] ==> Gordugunuz gibi elemanlar rastgele siralandi

        int hc =hs.hashCode();
        System.out.println("hc = " + hc);//329

        boolean is =hs.isEmpty();
        System.out.println("is = " + is);//false
    }
}
