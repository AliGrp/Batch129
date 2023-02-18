package advancepractise.advancepractiseday01;

import java.util.Arrays;

public class C05_ForEachLoop {
    public static void main(String[] args) {

        String str="$1 $12 €34 €56 $45 €78"; // euro dolar ayır topla

        String[] arr =str.split(" ");
        System.out.println(Arrays.toString(arr));

        int dolarToplam= 0;
        int euroToplam=0;

        for(String w: arr){
            if(w.contains("$")){
               dolarToplam+=Integer.valueOf( w.replaceAll("\\$",""));

            }else {
                euroToplam +=Integer.valueOf(w.replaceAll("€",""));

            }
            }
        System.out.println("euroToplam = " + euroToplam);
        System.out.println("dolarToplam = " + dolarToplam);

        }


    }

