package Practise05;

public class PractiseNestedLoop07 {
    public static void main(String[] args) {

/*
        for (int i = 1; i <4; i++) {
            System.out.println("week: "+i);
            for (int j = 1; j <=3; j++) {
                System.out.println("day: "+j);
                if(j==3){
                    System.out.println("....");
                }

            }

        }

 */
        // gördüğünüz şekli yazdırın
        /* X X X X
           X X X X
           X X X X
           X X X X
         */


        for (int i = 0; i <=3; i++) {
            String str="X ";

            for (int j = 0; j <=3; j++) {
            str=str+"X ";

            }
            System.out.println(str);

        }



    }
}
