package advancepractise.advancepractiseday02;

public class C01_ForLoopŞekil {
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


        char ch = 'A';
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ch + i) + " ");
            }
            System.out.println();


        }
    }
}
