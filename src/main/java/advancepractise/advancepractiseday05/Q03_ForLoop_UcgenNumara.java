package advancepractise.advancepractiseday05;

import java.util.Scanner;

public class Q03_ForLoop_UcgenNumara {
    public static void main(String[] args) {
        /*
                            1 2 3 4 5 6
                             2 3 4 5 6
                              3 4 5 6
                               4 5 6
                                5 6
                                 6
         */


        for (int i = 1; i <=6 ; i++) {//satir sayisi kontrolu
            for (int bosluk = 1; bosluk <i ; bosluk++) {
                System.out.print(" ");

            }
            for (int j =i; j <=6 ; j++) {//sutun sayisi kontrolu
                System.out.print(j+" ");

            }
            System.out.println();

        }

    }
}
