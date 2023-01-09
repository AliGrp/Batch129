package advancepractiseday05;

public class Q06_SimetricArray {
    public static void main(String[] args) {
        // Bir Array'in simetrik olup olmadığıını kontrol eden bir method oluşturunuz.

        int[] arr={2,4,1,8,-21,3,-21,8,1,4,2};
            simetric(arr);
        System.out.println(simetric(arr));
    }
    public static boolean simetric(int[]arr){

        boolean simetric = false;
        for (int i = 0; i < arr.length/2; i++) {

                if (arr[i]==arr[arr.length-1-i]){
                    simetric = true;
                }else {
                    simetric= false;
                    break;
                }


        }
        return  simetric;
    }

}
