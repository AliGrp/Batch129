package advancepractise.advancepractiseday07;

import java.time.LocalDate;

public class Bim {
    String urunadi;

    int adet;

    double fiyati;

    String sonTT;

    @Override
    public String toString() {
        return "Bim{" +
                "urunadi='" + urunadi + '\'' +
                ", adet=" + adet +
                ", fiyati=" + fiyati +
                ", sonTT='" + sonTT + '\'' +
                '}';
    }

    public Bim(String urunadi, int adet, double fiyati, int sTT) {
        this.urunadi = urunadi;

        this.adet = adet;
        if(adet<10){
            System.out.println( 10-adet+ " adet "+ urunadi+ " ekleme yapiniz ve urununuz 10 adete tamamlansin");
        }
        if (fiyati > 66) {
            fiyati = fiyati * 0.9;
        }
        this.fiyati = fiyati;
        this.sonTT = LocalDate.now().plusMonths(sTT).toString();;
    }

    public Bim(String urunadi, int adet, double fiyati) {
        this.urunadi = urunadi;
        this.adet = adet;
        this.fiyati = fiyati;
    }
}
