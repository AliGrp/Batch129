package lambdapractise;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        ciftPozitifLamExYaz(sayi);
        System.out.println("\n ********");

        ciftPozitifMetRef(sayi);
        System.out.println("\n ********");

        elementsKare(sayi);
        System.out.println("\n ********");

        tekrarsizKare(sayi);
        System.out.println("\n ********");

        buyuktenKucuge(sayi);
        System.out.println("\n ********");

        pozKupBirBas5(sayi);
        System.out.println("\n ********");

        toplama(sayi);
        System.out.println("\n ********");

        toplama2(sayi);
        System.out.println("\n ********");

        System.out.println("carpimi = " + carpim(sayi));
        System.out.println("\n ********");

        ciftElemanSorted(sayi);
        System.out.println("\n ********");

    }
//SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftPozitifLamExYaz(List<Integer> sayi){
        sayi.
                stream().
                filter(t->t%2==0 && t>0).
                forEach(t-> System.out.print(t+" "));
    }
//SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftPozitifMetRef(List<Integer> sayi){
        sayi.
                stream().
                filter(t->t%2==0 && t>0).
                forEach(Utils::yazdir);
    }
//SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın

    public static void elementsKare(List<Integer> sayi){
        sayi.
                stream().
                filter(Utils::ciftSayi).
                map(Utils::kareBul).
                forEach(Utils::yazdir);


    }
    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın

    public static void tekrarsizKare(List<Integer> sayi){
        sayi.
                stream().
                distinct().
                map(Utils::kareBul).
                forEach(Utils::yazdir);
    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın

    public static void buyuktenKucuge(List<Integer> sayi){
        sayi.
                stream().
                sorted(Comparator.reverseOrder()).
                forEach(Utils::yazdir);
    }

    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozKupBirBas5(List<Integer> sayi){
        sayi.
                stream().filter(t->t>0).
                map(Utils::kupBul).filter(t->t%10==5).
                forEach(Utils::yazdir);
    }
    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın

    public static void toplama(List<Integer> sayi){
        Integer toplam = sayi.stream().reduce(Integer::sum).get();
        //reduce methodu terminal methoddur yani reduce dan sonra hic bir method kullanilmaz
        System.out.println("toplam: "+toplam);

        Optional<Integer> toplam1 = sayi.stream().reduce(Integer::sum);
    }
// SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
public static void toplama2(List<Integer> sayi) {
    Integer toplam = sayi.stream().reduce(0,(t,u)->t+u);
    System.out.print("toplam = " + toplam);
}
//SORU9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın

    public static int carpim(List<Integer> sayi) {
     Integer carpimi =  sayi.stream().filter(t->t>0).reduce(1,(t,u)->t*u);
        return carpimi;
    }

    //SORU10 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    public static void ciftElemanSorted(List<Integer>sayi){
        List<Integer>sonuc=sayi.stream().filter(Utils::ciftSayi).map(Utils::kareBul).sorted().collect(Collectors.toList());
        System.out.println("sonuc = " + sonuc);
    }
}
