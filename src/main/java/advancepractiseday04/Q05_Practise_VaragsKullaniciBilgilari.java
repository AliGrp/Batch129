package advancepractiseday04;

public class Q05_Practise_VaragsKullaniciBilgilari {
    public static void main(String[] args) {
        //Ad, soyad, yaş ve bugüne dek yaşanılmış sehirler bilgilerini parametre olarak alıp yazdıran bir method oluşturunuz

        bilgiler("adem","marti", 22,"seattle","manatthan","yokohama");
        bilgiler2("Ali","Can","22","Ankara","Konya","Erzurum","Agri","Diyarbakir","Kayseri");
    }


    public static void bilgiler(String ad,String soyad, int yas, String... sehirler){
        System.out.println("ad: "+ ad);
        System.out.println("soyad: "+ soyad);
        System.out.println("yas: "+ yas);
        System.out.println("yasanilmis sehirler: ");
        for (String w:sehirler) {
            System.out.println(w+" ");
        }



    }
    public static void bilgiler2(String... bilgiler){

        for (int i = 0; i <bilgiler.length ; i++) {
            if (i==0){
                System.out.println("Ad: "+bilgiler[i]);

            } else if (i==1) {
                System.out.println("soyad: "+bilgiler[i]);

            } else if (i==2) {
                System.out.println("yas: "+ bilgiler[i]);
                System.out.println("Yasanilan sehirler");

            }else {
                System.out.println(bilgiler[i]+" ");
            }

        }
    }


}
