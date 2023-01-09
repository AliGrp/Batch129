package day12forloopwhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {
        //3 den 6 a kadar tam sayıları konsola yazdırın

        //1 Yol
        for (int i = 3; i < 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //2 Yol While-loop
        int i = 3;
        while (i < 7) {
            System.out.print(i + " ");
            i++;
        }

        //23 den 12 ye kadar çifft tam sayıları yazdır

        int k = 23;
        while (k>11){

            if (k%2==0){
                System.out.print(k + " ");
            }

            i--;

        }

        //verilen bir tam sayının rakamları toplamını yazınız
//1 yol while loop
        int num=578;
        num=Math.abs(num);

        int sum=0;

        while (num>0){

            sum=sum+num%10;

            num/=10;

        }
        System.out.println(sum);

        //2.yol for loop

        int sum2=0;

        for(int i2=578; i2>0; i2/=10){
            sum2= sum2 + i2%10;
        }
        System.out.println(sum);

    }

}
