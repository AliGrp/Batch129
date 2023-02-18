package advancepractise.advancepractiseday09.methodoverriding;

public class Isci extends Banka{
    @Override
    public double faizHesapla(double alinacakKrdei) {
        return alinacakKrdei*0.13;
    }
}
