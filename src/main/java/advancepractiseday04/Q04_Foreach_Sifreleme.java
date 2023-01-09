package advancepractiseday04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_Foreach_Sifreleme {
    public static void main(String[] args) {

        /*Kullanıcıdan alınan bir String'de bulunan her bir karakteri alfabetik sırada bir sonraki karakter ile değiştirerek
    şifreleyen bir method ve şifreli ismi çözen ayrı bir method yazınız. (foreach loop kullanınız)*/

        System.out.println(sifreleme());

        System.out.println(sifreCoz());
    }

        public static String sifreleme(){
            Scanner input = new Scanner(System.in);                            //normal for loop ile odev
            System.out.println("Bir String giriniz");
            String[] arr = input.nextLine().split("");
            String sifreliString = "";
            for (String w:arr) {
                if (w.equals("z")){
                    sifreliString+="a";

                } else if (w.equals("Z")) {
                    sifreliString+="A";

                }else {
                    sifreliString += (char) (w.charAt(0) + 1);   //Bize bir fazla olan asci degeri verir "char" yazdik tekrar karaktere cevirsin diye
                }

            }
            return sifreliString;

        }
    public static String sifreCoz(){
        Scanner input = new Scanner(System.in);                            //normal for loop ile odev
        System.out.println("Bir String giriniz");
        String[] arr = input.nextLine().split("");
        String sifresizString = "";
        for (String w:arr) {
            if (w.equals("a")){
                sifresizString+="z";

            } else if (w.equals("A")) {
                sifresizString+="Z";

            }else {
                sifresizString += (char) (w.charAt(0) - 1);   //Bize bir fazla olan asci degeri verir "char" yazdik tekrar karaktere cevirsin diye
            }

        }
        return sifresizString;

    }
    }



