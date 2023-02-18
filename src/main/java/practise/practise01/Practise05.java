package practise.practise01;

public class Practise05 {
    public static void main(String[] args) {
       String s = "Miami ";
       int boşlukOlmayanSonKrkIndex =s.trim().length()-1;
        String boslukOlmayanSonKrk = s.substring(boşlukOlmayanSonKrkIndex,
                boşlukOlmayanSonKrkIndex +1);
        System.out.println("Bosluk olmayan son karakter: " + boslukOlmayanSonKrk);


        String n= "  Miami";
        System.out.println(n);
        int n1 =n.trim().length()-2;
        String n2 = n.substring(n1,n1+1);
        System.out.println(n2);
    }


}
