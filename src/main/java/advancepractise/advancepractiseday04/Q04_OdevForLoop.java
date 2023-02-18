package advancepractise.advancepractiseday04;

import java.util.Scanner;

public class Q04_OdevForLoop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Kullanmici String Gir");
        String cml=sc.nextLine();



        String sifreli="";

        for(int i=0;i<cml.length();i++){
            char k=(char)(cml.charAt(i)+1);
            sifreli=sifreli+k;




        }

        System.out.println(sifreli);
    }
}
