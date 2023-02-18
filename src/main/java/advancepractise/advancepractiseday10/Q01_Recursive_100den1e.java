package advancepractise.advancepractiseday10;

public class Q01_Recursive_100den1e {
    //100 den bire kadar sayilari loop ve sayilari kullanmadan yazdiriniz

    public static void main(String[] args) {
        System.out.println((char) 100);//d
        System.out.println((int)'d');//100

        sayilariYazdir('d');
    }
    public static void sayilariYazdir(char ch){

        if (ch>='g'/'g') {//sayininn kendine bolumu bir verir
            System.out.println((int)ch);
            ch--;
            sayilariYazdir(ch);
        }
    }
}
