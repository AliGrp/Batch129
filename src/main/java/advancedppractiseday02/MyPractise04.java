package advancedppractiseday02;

public class MyPractise04 {
    public static void main(String[] args) {

        /*
		Şekli Yazdırınız:

        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F

        */

        char ch='A';
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <i; j++) {
                for (int k = 8; k > i; k--) {
                    System.out.print(" ");

                }
                System.out.print((char)(ch+i)+" ");

            }
            System.out.println(ch);

        }
    }
}
