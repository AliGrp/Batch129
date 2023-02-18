package day30exceptions;

public class Exceptions04 {
    public static void main(String[] args) {

        String arr[]={"A","G","M","L"};
        getElemenFromArray(arr,1);
        getElemenFromArray(arr,5);
    }
    public static void getElemenFromArray(String[] s, int idx){

        try {


            String el = s[idx];
            System.out.println("el = " + el);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
}
