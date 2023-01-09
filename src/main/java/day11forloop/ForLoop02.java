package day11forloop;

public class ForLoop02 {
    public static void main(String[] args) {
        //verilen bir stringde a karakteri hariç tüm karakterleri yazdırın

        String k ="madagaskar"; //Mdgskr

        //1.Yol:
        System.out.println(k.replaceAll("a",""));
        //2.Yol:
        for(int i=0; i<k.length(); i++){
            char ch = k.charAt(i);
            if(ch!='a'){
                System.out.print(ch);
            }
        }
        //3.Yol
        System.out.println();
        for(int i=0; i<k.length(); i++){
            char ch = k.charAt(i);
            if(ch=='a'){
                continue; // contine keywordu bazı şartlarda loopun adımlarımızı atlamamızı sağlar

            }
            System.out.print(ch);
        }
    }
}
