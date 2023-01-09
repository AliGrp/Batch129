package day21listvarargs;

public class Practise_Varargs {
    public static void main(String[] args) {
        add(5,6,2,78,91,5,7,4);
        multipy(5,6,2,78,91,5,7,4);

       updateWord("John","Mike");




    }

    private static void updateWord(String s, String f) {
        System.out.println("s = " + s);
        s=s.substring(0,1).toUpperCase()+f.substring(1);
        System.out.println("s = " + s);
    }

    private static void add(int... a) {
        int sum=0;
        for (int w:a) {
            sum=sum+w;


        }
        System.out.println("sum = " + sum);

    }
    private static void multipy(int... b) {
        int sum=1;
        for (int w:b) {
            sum=sum*w;


        }
        System.out.println("sum = " + sum);

    }
}
