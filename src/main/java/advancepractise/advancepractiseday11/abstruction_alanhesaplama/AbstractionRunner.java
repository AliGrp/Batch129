package advancepractise.advancepractiseday11.abstruction_alanhesaplama;

public class AbstractionRunner {
    //dikdortgen ve ucgenin alanlarini hesaplayan bir kod yaziniz(abstract ile)

    public static void main(String[] args) {
        Dikdortgen dikdortgen= new Dikdortgen();
        System.out.println("dikdortgen.alanHesapla(5,4) = " + dikdortgen.alanHesapla(5, 4));
        System.out.println("dikdortgen.alanHesapla(45,4) = " + dikdortgen.alanHesapla(45, 4));

        Ucgen ucgen = new Ucgen();
        System.out.println("ucgen.alanHesapla(5,4) = " + ucgen.alanHesapla(5, 4));
        System.out.println("ucgen.alanHesapla(78,4) = " + ucgen.alanHesapla(78, 4));
    }

}
