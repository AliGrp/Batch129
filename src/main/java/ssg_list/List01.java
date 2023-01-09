package ssg_list;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class List01 {
    public static void main(String[] args) {

        List<Integer> list1= new ArrayList<>();

//        List<Integer> list2= new ArrayList<Integer>();
//
//        ArrayList<Integer> list3= new ArrayList<>();
//
//        Collection<Integer> list4= new ArrayList<>();

        list1.add(15);
        list1.add(17);
        list1.add(18);
        list1.add(19);
        list1.add(20);

        System.out.println(list1);

        for (Integer w:list1){
            System.out.print(w);
        }
        System.out.println("-------------");

        for (int i = 0; i <list1.size() ; i++) {
            System.out.print(list1.get(i));

        }
    }
}
