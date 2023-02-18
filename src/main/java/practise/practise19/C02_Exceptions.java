package practise.practise19;

public class C02_Exceptions {
       /*
rastgeleSayi isminde bir method oluşturunuz.
Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
Bu iki random sayının toplamını yazdırın.
Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
("Sayı 12'den küçük ise hata verir") yazdırın.
  */

    public static void main(String[] args) {

        rastgeleSayi();
    }

    private static void rastgeleSayi() {

        int sayi1= (int) (Math.random()*10);
        int sayi2= (int) (Math.random()*10);
        System.out.println(sayi1+"=="+sayi2);
        System.out.println(sayi1+sayi2);

        int toplam=0;
        try {
            toplam=sayi1+sayi2;
            if ((toplam)<12){

                throw new IllegalArgumentException("  SAYI 12'DEN KUCUK OLMALI");
            }
        } catch (Exception e) {
            System.out.println("toplam 12den buyuk olsun"+e.getMessage());
        } finally {
            System.out.println("data base ile baglanti kes");
        }

    }

}
