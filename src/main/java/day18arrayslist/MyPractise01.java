package day18arrayslist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyPractise01 {
    public static void main(String[] args) {
        List<Integer>ages=new ArrayList<>();
        ages.add(38);
        ages.add(39);
        ages.add(37);
        System.out.println(ages);

        ages.add(1,88);
        ages.add(ages.size(),25);

        System.out.println(ages);

        ArrayList<Integer> newAges= new ArrayList<>();
        newAges.add(8);
        newAges.add(3);
        newAges.add(10);

        ages.addAll(ages.size(),newAges);
        System.out.println(ages);

        boolean b= ages.contains(880);
        System.out.println(b);

        boolean e= ages.equals(newAges);
        System.out.println(e);

        Collections.sort(ages);
        System.out.println(ages);


    }
}
