package day25datetimestringbuilder;

public class StringBuilder01 {


//Java da String , "String Class"  kullaninarak veya "StringBuilder Class" kullanilarak olusturulabilir.
//"String Class" kullanilarak urettiginiz String'ler "Immutable"( degistirelemez) dir.
//"StringBuilder Class" kullanarak urettiginiz String'ler "Mutable"(Degistirelebilir) dir.


    public static void main(String[] args) {

        //Immutable
        String s = "Java";
        String t = s + "!";
        String w = s + "?";


        //String'i degistirdikten sonra ayni String assign ederseniz, Java yine yeni bir container olusturur,
        //degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren oku yeni container'a yonlendirir.
        //Dolayisiyla eski container adressiz kalir, ve "Garbage Collector" adressiz olan container'lari siler.
        String a = "Money ";
        a = a + "More";
        System.out.println("a = " + a);


        //Mutable ikinci yolu
        StringBuilder sb = new StringBuilder("Python");
        sb.append("!");
        System.out.println("sb = " + sb);
        System.out.println(sb.append("3").append("?"));

        StringBuilder sb1 = new StringBuilder("ALi");
        sb1.append(" GARIP");
        System.out.println(sb1);


        //StringBuilder kullanarak String uretmenin ikinci yolu
        StringBuilder sb2 = new StringBuilder();//java bize 16 tane bos kutu verir bunuda capacity ile gorduk
        System.out.println(sb2.append("java"));
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34 16*2+2 kutu sayisini karakter sayisi gectigi icin arttirdi

        sb2.append("yyyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());//70 var olan * iki arti ikide bonus verir


        System.out.println(sb2);

        //StringBuilder kullanarak String uretmenin ucuncu yolu
        StringBuilder sb3 = new StringBuilder(2);

        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6 var olan kadar yine kapasite asimi oldugu icin * 2 yapti arti 2 ekledi


        //Insert ile karaketde belirledigin araya istedigini koy
        sb3.insert(2,"XXXXX");
        System.out.println(sb3);

//    TO STRING METHODU STRINGBUILDERI STRINGE CEVIRIR
//    string classta var olan string builder classta var olmayan solit method gibi methodlara ihtiyac duydugumuzd
//    to string methodu kullanarak string class gecer ve o methodlari kullanuriz
        sb3.toString().split("l");

        //Stringi tekrar stringbuildere cevirebilirsiniz
        StringBuilder sb4 = new StringBuilder(sb3);

        //reverse methodu stringleri ters cevirir
        sb3.reverse();
        System.out.println(sb3);//oXXXXXlF

        //Indexi birdeki karakteri sil
        sb3.deleteCharAt(1);
        System.out.println("sb4 = " + sb4);//FlXXXXXo

        //indeksler arasinde sildirmek icin
        sb3.delete(1,5);
        System.out.println(sb3);


        //compareto ascii degerlere bakarark arasindaki farki yazar
        StringBuilder sb5 = new StringBuilder("Java");
        StringBuilder sb6 = new StringBuilder("Kava");

        System.out.println(sb5.compareTo(sb6));//0

        //index ikideki characteri 'm' cevirir
        sb6.setCharAt(2, 'm');
        System.out.println("sb6 = " + sb6);


        sb6.replace(1,3,"xyz");
        System.out.println("sb6 = " + sb6);// Kxyza


        //String builder classta kullanmaniza izin verilen substring gibi bazi string class methodlari vardir
        //bu methodlari Stringbuilder ustunde kullaninca Stringbuilderin orjinal degeri degismez
        String s7 =sb6.substring(1,3);
        System.out.println(sb6);// Kxyza
        System.out.println(s7);//xy





        StringBuilder sb9 = new StringBuilder("Learn");

        System.out.println("Before trim: " + sb9.capacity());

        sb9.trimToSize();

        System.out.println("After trim: " + sb9.capacity());









































    }
}