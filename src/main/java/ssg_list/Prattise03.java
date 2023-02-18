package ssg_list;

import java.util.ArrayList;
import java.util.List;

public class Prattise03 {
    public static void main(String[] args) {

        // verilen bir array'den istenen elementi(kac tane varsa) silip, kalanlari
        // yeni bir list  olarak yazdiran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};

        istenmeyen(arr,3);
    }

    private static void istenmeyen(int[] arr, int istenmeyen) {
        List<Integer> list = new ArrayList<>();
        for (int w:arr) {
            if (w!=istenmeyen){
                list.add(w);
            }
        }
        System.out.println(list);
    }
}
