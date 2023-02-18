package advancepractise.advancepractiseday03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız bir sayıyı bir list'e ekleyen,
        // list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.

        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while(true){
            System.out.println("ekleme yapmak icin : 'add'\n"+
                    "Guncellemek icin 'set' \n"+
                    "Silmek icin: 'remove' \n"+
                    "Cikmak icin: 'break' komutunuu giriniz. ");
            String komut=input.next();


            if (komut.equalsIgnoreCase("add")){
                System.out.println("eklemek istediginiz tam sayiyi giriniz ");
                list.add(input.nextInt());

            } else if (komut.equalsIgnoreCase("set")) {
                System.out.println("Guncellemek istediginiz sayiyi giriniz. ");
                Integer gucellenecekSayi= input.nextInt();
                int guncellenecekIndex= list.indexOf(gucellenecekSayi);
                System.out.println("girmek istediginiz sayiyi giriniz. ");
                int yerniSayi= input.nextInt();

                list.set(guncellenecekIndex,yerniSayi);

            }else if (komut.equalsIgnoreCase("remove")){
                System.out.println("Silmek istedginiz sayiyi giriniz");
                Integer silinecekSayi= input.nextInt();

                list.remove(silinecekSayi);

            } else if (komut.equalsIgnoreCase("break")) {
                break;

            }else {
                System.out.println("Gecerli bir komut giriniz");
            }
            System.out.println(list);


        }
        System.out.println("Gule gule");
    }
}
