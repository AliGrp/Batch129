package day21listvarargs;

public class VarArgs01 {
    public static void main(String[] args) {

        addTwoNumbers(3,5);

        addThreeNumbers(3,5,8);

        add(3,5,6,8,9,6,7,11);//argumant
    }//main



    //Iki sayiyi toplayan mehod olusturun
    public static void addTwoNumbers(int a, int b){//parametre
        System.out.println(a+b);
    }


    //Uc sayiyi tplayan method olusturun
    public static void addThreeNumbers(int a,int b,int c){
        System.out.println(a+b+c);
    }


    // istediginiz kadar sayi toplamak icin method
    public static void add(int... a){
        int sum =0;
        for(int w:a){
            sum = sum+w;
        }
        System.out.println(sum);
    }





}//class
