package practise.practise15;

public class KumandaRunner {
    public static void main(String[] args) {

        Kumanda tv = new Kumanda(11.5,7,9.8);
        tv.gucDugmesi();
        System.out.println("tv.kanalDegistirme(\"B\") = " + tv.kanalDegistirme("B"));
        System.out.println("tv.sesArtirma() = " + tv.sesArtirma());
        System.out.println("tv.sesAzaltma() = " + tv.sesAzaltma());
    }
}
