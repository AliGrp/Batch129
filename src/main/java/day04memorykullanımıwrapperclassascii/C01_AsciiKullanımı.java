package day04memorykullanımıwrapperclassascii;

public class C01_AsciiKullanımı {
    public static void main(String[] args) {
        int değer = 20;
        char harf ='a';

        int sum = değer + harf;
        System.out.println("sum = " + sum);

        char rakam1 = '1';
        System.out.println("rakam1 = " + rakam1);
        char rakam4 = '5';
        System.out.println("rakam4 = " + rakam4);
        System.out.println("rakam4+rakam1==" + (rakam4+rakam1));
        char kh = 'a';
        char bh = 'A';
        System.out.println("küçük a ascii değeri=="+(kh+0));

        System.out.println("(bh+kh+rakam4) = " + (bh+kh+rakam4));
        System.out.println("rakam4 değeri=="+(rakam4+0));
        System.out.println("kh>bh="+ (kh>bh));


    }
}
