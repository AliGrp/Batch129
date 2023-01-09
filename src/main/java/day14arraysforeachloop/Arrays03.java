package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //String bir array oluşturunuz
        // 6 eleman yerleştirin
        // karakter sayısı 5den çok olanarı siliniz

        /* Logic: yeni bir array oluşturup charecter sayısı 5 ve 5den küçük
        elemanları yeni arraye tansfer edeceğizz

        >Array oluşturmak için iki şey belirlenmeli
        1)Elemanların data type
        2)Yeni array kaç tane eleman olacak

        Verilen arrayda eleman sayuısı 5 ve 5ten küçük olan var bulmalıyız

         */

        String aName[]= new String[6];
        aName[0]="kurt";
        aName[1]="tilki";
        aName[2]="inek";
        aName[3]="manda";
        aName[4]="papağan";
        aName[5]="kuş";
        System.out.println(Arrays.toString(aName));

        int counter = 0;

        for (String w : aName){
            if(w.length()<=5){
                counter++;

            }
        }
        System.out.println(counter);

        String newaName[] = new String[counter];
        int idx = 0;
        for(String w : aName){

            if(w.length()<=5){
                newaName[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newaName));


    }
}
