package advancepractise.advancepractiseday09.methodoverriding;

public class Q02_Kredi {
    //Bir bankadan kredi alan müşterileri kredi türlerine göre objeler oluşturarak kaydeden bir kod yazınız.
    //Emekli: %12 standart faiz, İşçi: %15 işçi oranı, Memur: %10 memur oranı


    public static void main(String[] args) {

        Emekli emekliHasanAmca = new Emekli();
        System.out.println("emekliHasanAmca = " + emekliHasanAmca.faizHesapla(100));

        Memur mumur1 =new Memur();
        System.out.println("mumur1 = " + mumur1.faizHesapla(200));

        Isci isci1 = new Isci();
        System.out.println("isci1.faizHesapla(124) = " + isci1.faizHesapla(124));
    }
}
