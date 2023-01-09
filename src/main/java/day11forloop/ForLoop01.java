package day11forloop;

public class ForLoop01 {
    public static void main(String[] args) {
        // verilaen bir stringde ilk ilk a harfinden önceki tüm karakterleri ekrana yazdırın
        String s = "Tramvay";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                break;// a characterinden sonrakini at
            }
            System.out.print(s.charAt(i));//tr

        }
        System.out.println();

        String t = "Germany";
        for(int i =t.length()-1; i>=0; i--){
            if(t.charAt(i)=='a'){
                break;
            }
            System.out.print(t.charAt(i));
        }


    }
}
