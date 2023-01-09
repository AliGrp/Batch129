package day10switchloops;
//Aynı adımlar tekrar yapılması gerektiğinde loop kullanılır
public class Loops01 {
    public static void main(String[] args) {
        //ex1: Ekrana 5 kere "hi" yazdırınız.
        //1) foor loop
        for (int i = 1; i < 6; i++) {
            System.out.println("Hi Boklar (: ");

            //ex 2: 11 den 44e kadar tüm tam sayıları ekrana yazdırın
        }
        for (int ı = 11; ı < 45; ı++) {
            System.out.println(ı);

        }
        //ex3: 40 dan 23ekadarçift tam sayıları yazın

        for (int s = 40; s > 22; s--) {
            if (s % 2 == 0) {
                System.out.println(s);
            }


        }
        //ex4: 18den 56ya kadar tüm tek sayıları yazın
        for(int f=18 ; f<57 ; f++){
            if(f%2!=0){
                System.out.print(f+" ");
            }
        }

    }
}