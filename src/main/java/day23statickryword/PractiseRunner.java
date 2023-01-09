package day23statickryword;

public class PractiseRunner {
    public static void main(String[] args) {

        System.out.println("PractiseStudent.ogrenciIsmi = " + PractiseStudent.ogrenciIsmi);

        PractiseStudent obje1 =new PractiseStudent();
        int ogrenciYas = obje1.yasi;
        System.out.println("ogrenciYas = " + ogrenciYas);


       String harfAl = PractiseStudent.ilkHarf("Baki Mermi");
        System.out.println("harfAl = " + harfAl);

        PractiseStudent obje2 = new PractiseStudent();
        int harfsay = obje2.harfSay("Adem Berigel");
        System.out.println("harfsay = " + harfsay);

    }
}
