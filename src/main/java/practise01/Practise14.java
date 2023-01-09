package practise01;

public class Practise14 {
    public static void main(String[] args) {
        String s="java is easy";
        String sUpper= s.toUpperCase();
        System.out.println(sUpper);

        String sLower = s.toLowerCase();
        System.out.println(sLower);

        char ilkKrk= s.charAt(0);
        System.out.println(ilkKrk);

        char ilkKr1k= s.charAt(6);
        System.out.println(ilkKr1k);

        String sub= s.substring(5,7);
        System.out.println(sub);

        boolean sEst= s.contains("is");
        System.out.println(sEst);

        boolean sStart= s.startsWith("java");
        System.out.println(sStart);

        boolean sEnd = s.endsWith("easy");
        System.out.println(sEnd);

    }
}
