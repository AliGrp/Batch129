package advancepractise.advancepractiseday12;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q02_Map_FiyatToplami {
/*
    Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
    Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
    */
public static void main(String[] args) {

    Map<String,Double>urunler = new HashMap<>();
    urunler.put("Kemer",19.99);
    urunler.put("Gomlek",29.99);
    urunler.put("Ayakkabi",89.99);
    urunler.put("Kazak",24.99);
    urunler.put("Kravat",19.99);

    System.out.println("fiyatToplami(urunler) = " + fiyatToplami(urunler));
}
public static double fiyatToplami(Map<String,Double>map){
    System.out.println("Urunler ve fiyatlar: "+map);

    Collection<Double> fiyatlar = map.values();
    System.out.println("fiyatlar = " + fiyatlar);

    double sum =0;
    for (double w:fiyatlar) {
        sum+=w;
    }
    return sum;
}
}
