package practise.practise04;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Arrays;

public class Practise05 {
    public static void main(String[] args) {

        String colors[]= new String[6];
        colors[0]="red";
        colors[1]="blue";
        colors[2]="yellow";
        colors[3]="green";
        colors[4]="black";
        colors[5]="purple";

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));

        int num1 =Arrays.binarySearch(colors,"blue");
        System.out.println(num1);

        int num2 = Arrays.binarySearch(colors,"red");
        System.out.println(num2);


        int totalchar= 0;
        for(int i=0; i<colors.length;i++){

            totalchar= totalchar+colors[i].length();



        }
        System.out.println(totalchar);

    }
}
