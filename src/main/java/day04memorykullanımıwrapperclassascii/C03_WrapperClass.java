package day04memorykullanımıwrapperclassascii;

public class C03_WrapperClass {
    public static void main(String[] args) {
        System.out.println("-"+Byte.MIN_VALUE);
        System.out.println("-"+Byte.MAX_VALUE);
        System.out.println("-"+Integer.MAX_VALUE);
        System.out.println("-"+Short.MIN_VALUE);
        System.out.println("-"+Long.MIN_VALUE);
        System.out.println("-"+Float.MIN_VALUE);
        System.out.println("-"+Double.MAX_VALUE);
        System.out.println("-"+Character.MAX_VALUE);

        String str1 = "12345";
        String str2 = "6789";
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
    }
}
