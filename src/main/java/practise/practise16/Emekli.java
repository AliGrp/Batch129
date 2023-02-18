package practise.practise16;

public class Emekli extends Banka{
    @Override
    public double faizHesap(double krediMiktari) {
        return krediMiktari*12/100;
    }
}
