package advancepractise.advancepractiseday07;

public class Q05_Isletm_Runner {
    public static void main(String[] args) {

        Isletme dept1 = new Isletme();
        dept1.kasayaParaGirisi(10000);
        dept1.kasadandeptnaParaCikisi(5600);
        System.out.println("isletme kasa1; = " + dept1.kasa1);
        System.out.println("departman butcesi; = " + dept1.deptn);

        dept1.kasadandeptnaParaGirisi(2000);
        System.out.println("isletme kasa1; = " + dept1.kasa1);
        System.out.println("departman butcesi; = " + dept1.deptn);
    }
}
