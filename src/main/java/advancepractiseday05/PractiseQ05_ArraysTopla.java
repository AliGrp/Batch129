package advancepractiseday05;

public class PractiseQ05_ArraysTopla {
    public void main(String[] args) {
           /*
   Toplamları, verilen bir sayıya eşit olan  Array element çiflerini yazdıran bir method oluşturunuz.
   {4,6,5,-10,8,5,20} ===> 10
   4 + 6 = 10
   5 + 5 = 10
  -10 + 20 = 10
   */

        int[] arr1={4,6,5,-10,8,5,20};

        int arr2=0;
        ikilileribul(arr1,arr2);

    }

    public static void ikilileribul(int[]arr1,int arr2){

        for (int i = 0; i < arr1.length ; i++) {
            for (int j = i+1; j < arr1.length ; j++) {

                if (arr1[i]+arr1[j]==arr2){
                    System.out.println(arr1[i]+"+"+arr1[j]+"="+arr2);

                }
            }

        }

    }
}
