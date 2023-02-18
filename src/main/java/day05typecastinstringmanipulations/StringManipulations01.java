package day05typecastinstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String s = "Java is easy";
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);
char firstChar = s.charAt(1);

        char secondChar = s.charAt(5);
        System.out.println("ilk harf ve son harf= " + firstChar+secondChar);
        String sSub1 = s.substring(0,4);//İlk index 0 sıfırfır son index bir sonraki karakterinki yazılır.

        // Bizden istenen ilk 3 karakterdi fakat 4 indexininde yazdık.
        System.out.println(sSub1);

        String sSub2 = s.substring(5,8);
        System.out.println(sSub2);

        boolean isBegin = s.startsWith("i",5);
        System.out.println(isBegin);

        int sLength = s.length();
        System.out.println(sLength);
    }
}
