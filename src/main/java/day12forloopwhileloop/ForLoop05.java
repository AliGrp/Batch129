package day12forloopwhileloop;

public class ForLoop05 {
    public static void main(String[] args) {
        //hiç sayı kullanmadan 1 den 100e kadar olan sayıları konsola yazdırın

        for (int i = 'd' / 'd'; i <= 'd'; i++) {
            System.out.print(i + " ");
        }
//Note: Bazı looplar hiç çalışmayabilir
        for (int i = 1; i < 0; i--) {
            System.out.println("hi!");//Zero execution
        }
//Note: Bazı looplar sonsuz defa çalışabilir
        // Bu tarz looplaea Infınıte Loop denir
        // Infınıte loop genelikle ıncrement decrement hatalarından olur.

        for (int i = 1; i < 10; i--) {

        }

        //Note: Başka ınfınıte(sonsuz loop)
        // loop oluşturduğunuzda ikinci kısmı yazmazsanız ınfınıte loop olur
        for (int i = 1;   ;  ){
            System.out.println("hi");
        }


    }

    }

