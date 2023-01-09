package practise03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practise02 {
    public static void main(String[] args) {
        String stdName[]= new String[5];
        System.out.println(Arrays.toString(stdName));
        stdName[2]="ajda";
        stdName[3]= "tarkan";
        System.out.println(Arrays.toString(stdName));

        for( int i=0; i<stdName.length; i++){

            System.out.println(stdName[i]+"!");

        }
        System.out.println(stdName[2]);
    }

}
