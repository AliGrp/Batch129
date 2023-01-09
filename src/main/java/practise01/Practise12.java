package practise01;

public class Practise12 {
    public static void main(String[] args) {
        char krk='/';
        int sy=8;
        System.out.println(krk>sy);
        int sayı1 = 15;
        System.out.println(10<sayı1&&sayı1<100);
        System.out.println(20>sayı1 || sayı1>56);

        byte primitiveByte=15;
        Byte wrapperbyte=15;
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        float f1 = 12.99f;
        Float wrapper = f1;

        String str1="45";
        String str2 ="4";
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));

        int population=70000;
        float ınfF= population;
        System.out.println(ınfF);

        long pip= 845845845845845l;
        short içinde=(short)pip;
        System.out.println(içinde);

        short num = 260;
        byte num1=(byte)num;
        System.out.println(num1);


    }
}
