package lambdapractise;

public class Utils {

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
