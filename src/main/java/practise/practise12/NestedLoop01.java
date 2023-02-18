package practise.practise12;

public class NestedLoop01 {
    public static void main(String[] args) {
        /*

        ? ? ? ? ?
        ? ? ? ? ?
        ? ? ? ? ?
        ? ? ? ? ?
        ? ? ? ? ?

         */

        for (int i = 1; i <=5; i++) {//outer

            for (int j = 1; j <=5 ; j++) {//inner loop
                System.out.print("? ");

            }
            System.out.println("*");
        }
    }
}
