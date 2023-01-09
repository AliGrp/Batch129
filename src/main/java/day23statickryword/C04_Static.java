package day23statickryword;

public class C04_Static {
    public static void main(String[] args) {

        System.out.println("C03_StaticDepo.okulIsmi = " + C03_StaticDepo.okulIsmi);//Emre Okullari


        C03_StaticDepo obje1 = new C03_StaticDepo();
        System.out.println("ogrenciGul = " + obje1.ogrenciGul);//Gul Gecer

        C03_StaticDepo.okulIsmi=" Mine Okullari ";
        System.out.println("="+C03_StaticDepo.okulIsmi);//Mine Okullari

        C03_StaticDepo obje2 = new C03_StaticDepo();
        obje2.ogrenciGul=" Zeynep Karagol ";
        System.out.println("obje2.ogrenciGul = " + obje2.ogrenciGul);//Zeynep Karagol
        System.out.println("obje1 = " + obje1.ogrenciGul);//Gul Gecer

        System.out.println(obje2.okulIsmi);//mINE okuLLARI
    }
}
