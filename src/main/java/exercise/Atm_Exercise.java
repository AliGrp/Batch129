package exercise;

import java.util.Scanner;

public class Atm_Exercise {
        /*
           -Iki tane ismim olacan bunlar "Tom Hanks" ve"Ali Can"
        -Bakiye görüntülemek için --1
        -Para çekmek için --2
        -Farkli hesaba para yatırmak için --3
                 */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String islemSecenekleri= "Bakiye Goruntuleme ==> 1 \n " +
                    "Para Cekme ==> 2 \n" +
                    "Havale/EFT/FAST ==> 3";

            double tomBakiye = 2450;
            String tomIBAN = "TR:1345 000 767 985 345 6972 76 45";
            String tomKullanici = "tom12";
            String tomSifre = "123";

            double aliBakiye = 1250;
            String aliIBAN = "TR:1345 4356 656 985 987 6972 76 45";
            System.out.println("Hosgeldiniz");
            System.out.println("Lutfen bilgilerinizi giriniz");

            System.out.print("Kullanici adini giriniz");
            String kullaniciAdi = input.nextLine();

            System.out.print("Sifrenizi giriniz");
            String sifre = input.nextLine();

            do {


                if (kullaniciAdi.equals("tom12") && sifre.equals("123")) {
                    System.out.println("Tom HANKS hesabina giris yapildi");
                    System.out.println(islemSecenekleri);

                    System.out.println("Lutfen bir secim yapiniz :");
                    String secim = input.nextLine();

                    switch (secim) {
                        case "1":
                            System.out.println("Bakiyeniz" + tomBakiye + "$'dir");
                            break;

                        case "2":
                            System.out.println("Lutfen cekmek istediginiz tutari giriniz");
                            int cekilecekTutar = input.nextInt();
                            if (cekilecekTutar <= tomBakiye) {
                                tomBakiye -= cekilecekTutar;
                                System.out.println("Kalan bakiyeniz" + tomBakiye);
                            } else {
                                System.out.println("Bakiyenizden fazla tutari cekemezsiniz");
                            }
                            break;

                        case "3":
                            System.out.println("Ne kadar EFT yapacaksiniz");
                            int yatiralacakTutar = input.nextInt();
                            if (yatiralacakTutar <= tomBakiye) {
                                System.out.println("Lutfen ibani giriniz");
                                input.nextLine();
                                String yatiralacakIban = input.nextLine();

                                if (yatiralacakIban.equals(aliIBAN)) {
                                    System.out.println("EFT gerceklestirildi");
                                    tomBakiye -= aliBakiye;
                                    aliBakiye += tomBakiye;

                                    System.out.println("Tomun Hesabi: " + tomBakiye);
                                    System.out.println("Alinin hesabi: " + aliBakiye);
                                } else {
                                    System.out.println("iBAN hatali");
                                }
                                break;
                            }


                    }
                } else {
                    System.out.println("Kullanici adi veya sifreniz hatali");
                }
            }while (true);
        }

}
