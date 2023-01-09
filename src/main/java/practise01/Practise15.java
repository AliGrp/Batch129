package practise01;

public class Practise15 {
    public static void main(String[] args) {
        String t= "Ali 13 yaşındadır";

        String tRep= t.replaceAll("[A-a]","*");
        System.out.println(tRep);

        String trep= t.replaceAll("[^0-9]","");
        System.out.println(trep);



    }
}
