package day31exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
        Object obj =70;

        try {
            String str = (String) obj;
            System.out.println(str);
        }catch (ClassCastException e){
            System.out.println(e.getMessage());
            System.out.println("her data type  i her data typena cevirilmez");
        }
    }
}
