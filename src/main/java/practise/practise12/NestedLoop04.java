package practise.practise12;

public class NestedLoop04 {
    public static void main(String[] args) {


        for (int i = 1; i <5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <5 ; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println();
        for (int i = 4; i >=0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
