package practise.Practise05;

public class PractiseForLoop05 {
    public static void main(String[] args) {
        //Ex: 1 den 100e kadar 6 ile bölünebilen hariç tüm tam sayıları yazdırın

        //for (int i=1; i<=100; i++){
        // if (i%6==0){
        // continue; // contine görüyorsa devam et boşver yani
        // }

        //System.out.print(i+" ");
// size verilen bir stringi ters çeviren kodu yazınız
        String name = "ali garip";
        String ters="";
        for (int i = name.length()-1; i >= 0; i--) {
            char harf = name.charAt(i);
            //ters= ters+harf; alttaki ile aynı fakat alttakini öğren
            ters+=harf; //profesyonel yazım bunu anla

        }
        System.out.println(ters);
//

    }

}





