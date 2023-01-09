package day23statickryword;

public class C02_Static {

    static int sayi1;
     int sayi2;//static olmadigi icin goremiyoruz bu variable = instance

    public static void main(String[] args) {//protokol

        System.out.println("sayi1 = " + sayi1);//0

        C02_Static obje1 = new C02_Static(); //== Scanner input = new Scanner(System.in);
        System.out.println("sayi2 = " + obje1.sayi2);

         sayi1++;
        System.out.println("sayi1 = " + sayi1);//1

        obje1.sayi2++;
        System.out.println("sayi2 = " + obje1.sayi2);//1

        obje1.sayi2=67;
        System.out.println("sayi2 = " + obje1.sayi2);

        C02_Static obje2 = new C02_Static();
        System.out.println("obje2.sayi2 = " + obje2.sayi2);


    }//main
}
