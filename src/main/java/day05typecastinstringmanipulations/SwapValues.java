package day05typecastinstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {

        int a = 12;
        int b = 45;
        int temp = 0;
        System.out.println("a:"+ a );
        System.out.println("b"+ b );
        temp = a;
        a = b;
        b = temp;
        System.out.println("a"+ a );
        System.out.println("b"+ b );

        int x = 48;
        int y = 254;

        x = x + y;
        y = x - y;
        x= x - y;
        System.out.println("x"+x);
        System.out.println("y"+y);
        String name1 ="ali";
        String name2 ="yasemin";
        System.out.println("eski isim 1"+name1);
        System.out.println("eski isim 2"+name2);
        String tempo = String.valueOf(0);


        tempo = name1;
        name1 = name2;
        name2 = tempo;
        System.out.println("eski isim 1"+name1);
        System.out.println("eski isim 2"+name2);



    }
}
