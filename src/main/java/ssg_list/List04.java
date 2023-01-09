package ssg_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List04 {
    public static void main(String[] args) {
        // verilen bir array'i listeye cevirin
        String arr[]={"A" , "B" , "C"};

        List<String> listcevir = new ArrayList<>();
        for (String w:arr
             ) {
            listcevir.add(w);

        }
        System.out.println(listcevir);


        List<String> listcevir2List = Arrays.asList(arr);
        System.out.println(listcevir2List);


        List<String> listcevir2List1 =new ArrayList<>(List.of(arr));
        System.out.println(listcevir2List1);
    }
}
