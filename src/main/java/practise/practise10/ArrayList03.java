package practise.practise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {
        //Example 2: Musterinizin istedigi urunun stoklarinizda olup olmadigini
//gosteren kodu yaziniz.
//Stokta varsa o urunu "Ayrildi" ya ceviriniz yoksa o urunu  List'e ekleyiniz
//           [A, K, R, S]  ==> R  ==> [A, K, Ayrildi, S]
//           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]

        Scanner input= new Scanner(System.in);
        List<String>c= new ArrayList<>();

                c.add("Araba");
                c.add("Kalem");
                c.add("Raki");
                c.add("Sehpa");

                String urun="";

                do {
                    System.out.println("Lutfen istediginiz urunun harfini giriniz");
                    urun= input.next();

                    if(c.contains(urun)){
                        c.set(c.indexOf(urun),"Ayrildi");


                    } else if (!urun.equals("Q")) {
                        c.add(urun);

                    }
                    System.out.println(c);


                }while (!urun.equals("Q"));

    }
}
