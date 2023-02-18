package day38lambda;

public class Utils {
    public static int getLengthSquare(String s) {
        return s.length() * s.length();
    }
    public static boolean isEven(String s) {
        return s.length()%2==0;
    }
    public static String getLastChar(String s){
       return s.substring(s.length()-1);
    }
    public static void printInTheSameLineWithSpace(Object obj){
        System.out.print(obj+" ");
    }
    public static void yazdir(Object a){
        System.out.print(a+" ");
    }
    public static int kareBul(int a){
        return a*a;
    }
    public static int kupBul(int a){
        return a*a*a;
    }

    public static boolean ciftSayi(int a){
        return a%2==0;
    }
    public static boolean tekSayi(int a){
        return a%2!=0;
    }

    public static int getSumOfDigits(int x){
        int sum=0;
        while (x!=0){
            sum=sum+x%10;
            x=x/10;
        }
        return sum;
    }
}
