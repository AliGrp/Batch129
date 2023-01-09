package day11forloop;

public class ForLoop04 {
    public static void main(String[] args) {
        //5 den 8e kadar tam sayıların toplamını veren kodu yazın

        int sum= 0;

        for(int i=5; i<9;i++ ){
            sum = sum+i;
        }
        System.out.println(sum);

        //7 den 9a kadar tam sayıların çarpımını veren kodu yazınız

        int sum1=1;
        for(int i=7; i<10; i++){
            sum1 = sum1*i;

        }
        System.out.println(sum1);
    }
}
