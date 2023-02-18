package practise.practise01;

public class StudyPractise01 {
    private static int fisrTwoMultipyThirdAdd(int a,int b,int c){
         return a*b+c;
    }
    public static void main(String[] args) {
        String s1 = "Java Kolaydır";
        System.out.println(s1.toLowerCase());

        char s2= s1.charAt(5);
        System.out.println(s2);
        // verilen sayıdan ilk ikisini çarpan üçncü toplayan kodu yazın

        int üçlüsonuç= fisrTwoMultipyThirdAdd(2,8,5);
        System.out.println(üçlüsonuç);
    }
}
