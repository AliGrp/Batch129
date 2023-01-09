package day05typecastinstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s = "Learn java earn money";
        boolean sEnd = s.endsWith("money");
        System.out.println(sEnd);

        String newS1 = s.replace("money","dollar");
        System.out.println(newS1);

        String newS2 = s.replace("earn","win");
        System.out.println(newS2);
        String s3 = s.replace("a","*");
        System.out.println(s3);

        String s4 = s.replace("n","xxx");
        System.out.println(s4);

        String t = "Ali 13 yaşındadır";

        String t1= t.replaceAll("[0-9]","*");
        System.out.println(t1);

        String t2 = t.replaceAll("[a-k]","1");
        System.out.println(t2);

        String t3 = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t3);

        String t4 = t.replaceAll("[^aeiouAEİOU]","&");
        System.out.println(t4);
    }


}
