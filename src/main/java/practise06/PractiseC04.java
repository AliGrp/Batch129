package practise06;

public class PractiseC04 {
    public static void main(String[] args) {
        // Soru 1 ) Asagidaki multi dimensional array'in
// tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.
// { {1,2,3}, {4,5,6} }
        int arr[][]={{1,2,3},{4,5,6}};

         int sum=1;
        for (int[] w:arr) {
            for (int k:w) {
                sum = sum*k;


            }
            System.out.println(sum);



        }
    }
}
