package day16arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
         // bir stringdeki sesli harflerin sayısını bulan kodu yaz

        String s = "Java brings you money";

        // 1'inci Yol:
        int vovels =s.replaceAll("[^aeiouAEİOU]","").length();
        System.out.println(vovels);

        // 2'nci Yol: use Array - Loop

        String letters[] = s.split("");
        System.out.println(Arrays.toString(letters));

        int counter =0;
        for(String w: letters){

            switch (w.toLowerCase()){
                case"a":
                case"e":
                case"i":
                case"o":
                case"u":
                    counter++;

            }

        }
        System.out.println(counter);

    }
}
