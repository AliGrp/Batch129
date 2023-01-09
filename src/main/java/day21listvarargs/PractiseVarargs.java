package day21listvarargs;

public class PractiseVarargs {
    public static void main(String[] args) {
        multipy(5,5);
        multipy(2);
        multipy(2.5,2.5);

        updateWord("John","black");
    }
    public static void multipy(int num1,int num2){
        System.out.println(num1*num2);
    }
    public static void multipy(int num1){
        System.out.println(num1*num1);
    }
    public static void multipy(double num,double num2){
        System.out.println(num*num2);
    }
    public static void updateWord(String s,String t){
        s=s.substring(0,1).toUpperCase()+t.substring(2);
        System.out.println(s);
    }
}
