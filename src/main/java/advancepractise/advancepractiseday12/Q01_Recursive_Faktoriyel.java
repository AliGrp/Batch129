package advancepractise.advancepractiseday12;

public class Q01_Recursive_Faktoriyel {
    //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)
    public static void main(String[] args) {

        System.out.println("faktoriyel(8) = " + faktoriyel(8));//40320

    }
    public static long faktoriyel(long sayi){

        if (sayi>=0) {
            if (sayi == 0 || sayi == 1) {
                return 1;
            } else {
                return sayi * faktoriyel(sayi - 1);
            }
        }else {
            throw  new ArithmeticException("Sayi 0'dan kucuk olamaz");

        }

    }
}
