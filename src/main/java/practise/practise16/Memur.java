package practise.practise16;

public class Memur extends Banka{
    @Override
    public double faizHesap(double krediMiktari) {
        return krediMiktari*10/100;
    }
}
