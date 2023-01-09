package day16arrays;

public class Arrays04 {
    public static void main(String[] args) {
        // arrayin içinde elemaının olup olmadığını kaçadet olduğunu yazın

        int a[]= {0,2,3,0,12,0};
        int num = 42;

        int counter= 0;

        for (int w : a) {
            if(w==num){
                counter++;

            }

        }

        if (counter>0){
            System.out.println(num +  " array'de " +counter+ " defa var.");
        }else{
            System.out.println(num+ " array de yok.");
        }




    }
}
