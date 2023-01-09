package day17multidimensionarrays;

import java.util.Arrays;

public class Md05 {
    public static void main(String[] args) {

        //bir md array oluşturun bu arraydeki tüm elemanların
        //çarpımını konsolo yazdırın

        int a[][]={{2,5},{3},{7,12,8}};

        int multi=1;

        for (int[]w:a) {

            for (int k:w){

                multi=multi*k;
            }

        }
        System.out.println(multi);

    }
}
