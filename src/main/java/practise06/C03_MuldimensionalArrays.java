package practise06;

public class C03_MuldimensionalArrays {
    public static void main(String[] args) {
        // Soru 1 ) Asagidaki multi dimensional array'in
// tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.
// { {1,2,3}, {4,5,6} }
        int arr[][]={{1,2,3},{4,5,6}};
        çarpınyazdır(arr);

    }
    private  static void çarpınyazdır(int[][]arr){

        int çarpın=1;
        for (int i = 0; i < arr.length ; i++) {
            for(int j=0; j<arr[i].length; j++){
                çarpın*=arr[i][j]; //çarpın=çarpın*arr[i][j];
                System.out.println(çarpın);

            }
            System.out.println(çarpın);

        }
        System.out.println(çarpın);
    }
}
