package day30exceptions;

public class Exceptions03 {
    public static void main(String[] args) {

        String s ="Java";
        getCharFromString(s,2);
        getCharFromString(s,4);
    }
    public static void getCharFromString(String s,int idx){

        try {

            char ch = s.charAt(idx);
            System.out.println(ch);

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullanma hatasi yaptiniz.."+ e.getMessage());
           // e.printStackTrace();
            System.out.println(e.getCause());
        }

    }
}
