package practise04;

import java.util.Arrays;

public class Practise06 {
    public static void main(String[] args) {

        String color[]= new String[6];
        color[0]="red";
        color[1]="orange";
        color[2]="blue";
        color[3]="yellow";
        color[4]="green";
        color[5]="brown";

        Arrays.sort(color);
        System.out.println(Arrays.toString(color));

        int total=0;
        for(int i=0; i<color.length; i++){


            total= total + color[i].length();

        }
        System.out.println(total);



    }
}
