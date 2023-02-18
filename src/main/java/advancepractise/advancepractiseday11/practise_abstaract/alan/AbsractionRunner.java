package advancepractise.advancepractiseday11.practise_abstaract.alan;

import advancepractise.advancepractiseday11.abstruction_alanhesaplama.Ucgen;

public class AbsractionRunner {
    public static void main(String[] args) {
        //dikdortgen ve ucgenin alanlarini hesaplayan bir kod yaziniz(abstract ile)

        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println(dikdortgen.alanHesap(5, 8));

        Ucgen ucgen = new Ucgen();
        System.out.println("ucgen.alanHesapla(8,18) = " + ucgen.alanHesapla(8, 18));
    }
}
