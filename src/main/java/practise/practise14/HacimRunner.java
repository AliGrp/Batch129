package practise.practise14;

public class HacimRunner {
    public static void main(String[] args) {

        Silindir silindir = new Silindir();
        double silindirHacmi = silindir.hacimHeapla(5,11);
        System.out.println("silindirHacmi = " + silindirHacmi);

        KarePrizma karePrizma=new KarePrizma();
        double karePrizmaHacmi = karePrizma.hacimHeapla(8,7);
        System.out.println("karePrizmaHacmi = " + karePrizmaHacmi);

        Koni koni = new Koni();
        double koniHacmi = koni.hacimHeapla(5,8);
        System.out.printf("koniHacmi = "+"%.2f" , koniHacmi);
    }
}
