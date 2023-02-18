package day32exceptionsinterface;

public class HondaRunner {
    public static void main(String[] args) {
        Civic civic=new Civic();
        civic.cool();
        civic.hp();
        civic.esp();
        civic.digital();
        System.out.println("Ac.price = " + Ac.price+"$");
        System.out.println("Engine.price = " + Engine.price+"$");
        System.out.println("Security.price = " + Security.price+"$");
        System.out.println("Ac.model = " + Ac.model);
        //Ac.price=7000; //Final variablare deger atayamazsin degistiremezsin
        System.out.println("Security.airBag = " + Security.airBag);
        System.out.println("Engine.hacmi = " + Engine.hacmi);

        Accord accord = new Accord();
        accord.cool();
        accord.hp();
        accord.esp();
        accord.digital();
        System.out.println("Security.imb = " + Security.imb);
    }
}
