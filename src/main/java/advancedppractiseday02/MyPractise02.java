package advancedppractiseday02;

public class MyPractise02 {
    public static void main(String[] args) {
         /*
  Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.
  ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
  ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
  ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
  ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
  Diğerleri için “Diğer Karakterleri” yazdırınız.
  */
        String rastgeleHarf=rastgeleHarf().toLowerCase();
        System.out.println(rastgeleHarf);

        switch (rastgeleHarf){
            case "a" :

            System.out.println("ilk karakter");
            break;

            case "b" :

                System.out.println("ikinci karakter");
                break;

            case "c" :

                System.out.println("üçüncü karakter");
                break;

            case "d" :

                System.out.println("dördüncü karakter");
                break;

            default:
                System.out.println("diğerleri");
        }

    }

    public static String rastgeleHarf(){

       String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxİndex= alfabe.length();
        int rastgeleİndex=(int) (Math.random()*maxİndex);


        return alfabe.substring(rastgeleİndex,rastgeleİndex+1);
    }
}
