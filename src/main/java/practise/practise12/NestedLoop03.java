package practise.practise12;

public class NestedLoop03 {
    public static void main(String[] args) {


        int input=5;

        for (int i = 0; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("================");


        for (int i = 0; i <=input ; i++) {
            for (int j = 0; j <=input ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

        for (int i = 1; i <6 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }

    }
}
