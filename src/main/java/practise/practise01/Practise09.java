package practise.practise01;

public class Practise09 {
    public static void main(String[] args) {
                //input sayı 12457
        int s = 12457;

        int num = s/1000;
        System.out.println(num);
        int ilkİkiRkm = (num%10)+(num/10);
        System.out.println(ilkİkiRkm);

        int num1 = s%1000;
        int sonİkiRkm= (num1/90)+(num1%10);
        System.out.println(sonİkiRkm);
        System.out.println(ilkİkiRkm+sonİkiRkm);



    }
}
