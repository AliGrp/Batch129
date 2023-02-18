package practise.practise16;

public class Kredi {
    //Bir bankadan kredi alan müşterileri kredi türlerine göre objeler oluşturarak kaydeden bir kod yazınız.
    //Emekli: %12 standart faiz, İşçi: %15 işçi oranı, Memur: %10 memur oranı

    public static void main(String[] args) {
        Emekli emekli = new Emekli();
        System.out.println("emekli = " + emekli.faizHesap(500));

        Isci isci = new Isci();
        System.out.println("isci = " + isci.faizHesap(1000));
    }
}
