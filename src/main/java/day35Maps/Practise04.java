package day35Maps;

import java.util.Arrays;
import java.util.HashMap;

public class Practise04 {
    public static void main(String[] args) {
        HashMap<String,Integer>hm = new HashMap<>();
        String name ="Daldaki elmalar";
        name=name.replaceAll("[^a-zA-z]","");
        String[] name1=name.split("");


        for (String w:name1) {

            Integer ali = hm.get(w);
            if (ali==null){
                hm.put(w,1);
            }else {
                hm.replace(w,ali+1);
            }

        }
        System.out.println(hm);
    }
}
