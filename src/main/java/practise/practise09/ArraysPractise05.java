package practise.practise09;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysPractise05 {
    public static void main(String[] args) {

        //yellowdan sonrakilei yazdırın

        String color[] = new String[6];
        color[0] = "purple";
        color[1] = "white";
        color[2] = "black";
        color[3] = "yellow";
        color[4] = "blue";
        color[5] = "pink";
        System.out.println(Arrays.toString(color));

        for (int i = color.length - 1; i >= 0; i--) {
            if (color[i].equals("yellow")) {
                break;

            }
            System.out.println(color[i]);

        }
        int counter=0;
        for (String w:color
             ) {
            if (w.length()<=5){
                counter++;
            }

        }
        System.out.println(counter);

        String newcolor[]= new String[counter];
        int idx=0;
        for (String w:color
             ) {
            if (w.length()<=5){
                newcolor[idx]=w;
                idx++;
            }


        }
        System.out.println(Arrays.toString(newcolor));
    }
}
