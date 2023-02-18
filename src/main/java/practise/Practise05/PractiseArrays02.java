package practise.Practise05;

import java.util.Arrays;

public class PractiseArrays02 {
    public static void main(String[] args) {
        int num[]=new int[5];

        num[0]=11;
        num[1]=25;
        num[2]=34;
        num[3]=19;
        num[4]=44;

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println(num[0] + num[num.length-1]);
        //int total= 0;
        for(int i=0; i< num.length; i++){
            //total=total+num[i];
            System.out.println(num[i]+"!");
        }
        //System.out.println(total);


    }
}
