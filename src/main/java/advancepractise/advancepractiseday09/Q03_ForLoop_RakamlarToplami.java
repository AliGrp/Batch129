package advancepractise.advancepractiseday09;

import java.util.Scanner;

public class Q03_ForLoop_RakamlarToplami {
    public static void main(String[] args) {
        /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
     Örn:
     input : J4\/4 1$ 34$¥
     output : 16
     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = input.nextLine();

        System.out.println("rakamlarToplami = " + rakamlarToplami(str));
    }

    static double rakamlarToplami(String str){

        int toplam = 0;

        for (int i = 0; i <str.length() ; i++) {

            if (Character.isDigit(str.charAt(i))){
                toplam+=Integer.parseInt(""+str.charAt(i));//char olan karakteri integer olarak almamiza yariyor
            }

        }
        System.out.println("toplam = "+toplam);



        return toplam;

    }
}
