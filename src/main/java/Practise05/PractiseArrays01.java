package Practise05;

import java.util.Arrays;

public class PractiseArrays01 {
    public static void main(String[] args) {

        String colors[]=new String[5];
        colors[0]="Black";
        colors[1]="White";
        colors[2]="Blue";
        colors[3]="Orange";
        colors[4]="Brown";

        System.out.println(Arrays.toString(colors));
        Arrays.sort(colors);
        System.out.println(colors[0].length()+colors[colors.length-1].length());

        String names[]=new String[5];
        names[0]="ali";
        names[1]="veli";
        names[2]="mehmet";
        names[3]="tolga";
        names[4]="burak";

        int totalChar= 0;
        for(int i=0; i< colors.length; i++){
            totalChar= totalChar+ names[i].length();


        }
        System.out.println(totalChar);
    }

}
