package practise04;

import java.util.Arrays;

public class ssg04 {
    public static void main(String[] args) {
        String days[]=new String[7];
        days[0]="sunday";
        days[1]="monday";
        days[3]="wednesday";
        days[4]="thursday";
        days[5]="friday";
        days[6]="saturday";

        System.out.println(Arrays.toString(days));
        System.out.println("ilk ve son gün karakter sayısı: "+(days[0].length()+ days[days.length-1].length()));

      int numbers[]= new int [6];

        numbers[0]=34;
        numbers[1]=12;
        numbers[2]=45;
        numbers[3]=42;
        numbers[4]=14;
        numbers[5]=32;

        System.out.println(Arrays.toString(numbers));

/*
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0] + numbers[numbers.length-1]);

 */
        int min = numbers[0];
        int max= numbers[0];
        int totalchar= 0;

        for(int w: numbers){
            min= Math.min(min, w);
            max= Math.max(max,w);


        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(min+max);




    }
}
