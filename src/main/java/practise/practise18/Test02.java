package practise.practise18;

public class Test02 {
    public static void main(String[] args) {
        String s = "abcd";

        try {

            Object obj = new Integer(12);

            s = (String)obj;

        }catch(ClassCastException e){

            System.out.println("Good");

        }

        System.out.println(s);

        Integer z = 0;


        try {

            String f = "abcd";

            z = Integer.parseInt(f);

        }catch(NumberFormatException e) {

            System.out.println("Good");

        }

        System.out.println(z);

        System.out.println();


        try {

            m(-12);

        }catch(IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

    }

    public static void m(int x) {

        if(x<0 || x>9) {

            throw new IllegalArgumentException("Good");

        }else {

            System.out.println(x);

        }

        System.out.println();

        try {

            n(9);

        }catch(IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

    }

    public static void n(int x) {

        if(x<0 || x>9) {

            throw new IllegalArgumentException("Good");

        }else {

            System.out.println(x);

        }
    }
}
