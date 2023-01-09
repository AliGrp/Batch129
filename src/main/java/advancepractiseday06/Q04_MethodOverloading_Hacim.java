package advancepractiseday06;

public class Q04_MethodOverloading_Hacim {
    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir kod oluşturunuz.(Method overloading kullanınız)
    public static void main(String[] args) {

        Hacim obje = new Hacim();
        int kup = obje.hacimHesapla(5);
        System.out.println("kup = " + kup);

        int dikdortgen = obje.hacimHesapla(5,4);
        System.out.println("dikdortgen = " + dikdortgen);

        int prizma = obje.hacimHesapla(5,4,6);
        System.out.println("prizma = " + prizma);
    }
}
