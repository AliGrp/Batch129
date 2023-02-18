package practise.practise18;

public class Test01 {
    public static void main(String[] args) {

        String s1 = "";

        String s2 = null;

        try {

            s1 = s1 + "J";

            System.out.println(s2.length());

            s1 = s1 + "a";

        } catch (ArithmeticException e) {

            s1 = s1 + "v";

        } catch (NullPointerException e) {

            s1 = s1 + "u";

        } finally {

            s1 = s1 + "n";

        }

        s1 = s1 + "e";

        System.out.println(s1);


        int num1 = 22;
        int num2 = 2;


        try {

            System.out.println(num1 / num2);

        } catch (ArithmeticException e) {

            System.out.println("Do not divide by 0");

        } finally {

            System.out.println("Done");

        }
        try {

            int a[]= {7, 8, 9};

            for (int i = 7; i <= 9; i++){

                System.out.println(a[i]);

            }

        } catch(Exception e) {

            System.out.println ("Out of index");

        } finally {

            System.out.println("Done!");

        }

        try {

            run();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    private static void run() {

        throw new RuntimeException("Run more");
    }


}