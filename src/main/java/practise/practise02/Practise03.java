package practise.practise02;

public class Practise03 {
    public static void main(String[] args) {

        for(int i=1 ; i<2 ;i++){
            System.out.println("hi");
        }

        for(int s=50 ; s>23 ;s--){
            if(s %2 !=0){
                System.out.println(s+" ");
            }
        }

        //ex1: 21 den 180e kadar hem 4 hemde 6 ile bölünebilin tam sayıları ekrana yazdıran kodu yazın

        for(int n=21 ; n<180 ; n++){
            if (n%4==0 && n%6==0){
                System.out.print(n+" ");
            }
        }

    }
}
