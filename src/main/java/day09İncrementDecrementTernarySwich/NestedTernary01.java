package day09İncrementDecrementTernarySwich;

public class NestedTernary01 {
    public static void main(String[] args) {

        int year = 2005;
        String y1 = year%100==0?(year%400==0? year+"leap":year+"not leap"):(year%4==0?year+"leap:": year+"not leap");
        System.out.println(y1);
    }
}
