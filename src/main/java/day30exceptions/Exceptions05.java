package day30exceptions;

public class Exceptions05 {
    public static void main(String[] args) {
        int a =112;
        int b=4;
        String s = "My Java";
        getCharFormString(s,a,b);
    }
    public static void getCharFormString(String s,int a, int b){
        try {

            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (ArithmeticException e){
            System.out.println("Do not devce by zero");

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz");
        }
    }
}
