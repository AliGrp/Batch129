package day12forloopwhileloop;

public class WhileLoop06 {
    public static void main(String[] args) {
        int sum2 = 0;
        for (int i2 = 578; i2 > 0; i2 /= 10) {
            sum2 = sum2 + i2 % 10;
        }
        System.out.println(sum2);

        int boş = 0;

        for (int i = 356; i > 0; i /= 10) {
            boş = boş + i % 10;

        }
        System.out.println(boş);
    }


}