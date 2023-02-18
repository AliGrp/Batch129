package day30exceptions;

public class Exceptions02 {
    public static void main(String[] args) {

        String s ="1234";
        convertSringToInt(s);

        String t="1a2b";
        convertSringToInt(t);
    }
    public static void convertSringToInt(String s){

        int intS=0;
        try {
             intS = Integer.valueOf(s);
        }catch (NumberFormatException e){
            System.out.println("Bir stringin sayiya donusturulmemesi icin rakam disi character icermemesi gerekir");
            System.out.println(e.getMessage());
        }
        System.out.println(intS+1);
        }
}
