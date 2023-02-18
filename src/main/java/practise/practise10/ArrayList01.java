package practise.practise10;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        // verilen bir listteki elemanlari tekrarsiz olarak yazdirin

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        System.out.println(a);

        List<Integer> yeniList=new ArrayList<>();
        for (int w:a
             ) {
            if (!yeniList.contains(w)){
                yeniList.add(w);
            }
        }
        System.out.println("yeniList = " + yeniList);
    }
}
