package day23statickryword;

public class PractiseStudent {

     static String ogrenciIsmi = "Ali Veli";

     public int yasi=14;

     public static String ilkHarf(String isim){

         String ilkIsim =isim.substring(0,1);
         String soyIsim =isim.split(" ")[1].substring(0,1);

         return ilkIsim + soyIsim;

     }

     public int harfSay(String isim){

         int sayac=0;
         for (int i = 0; i <isim.length() ; i++) {
             char ch = isim.toLowerCase().charAt(i);

             switch (ch){
                 case 'a':
                 case 'o':
                 case 'u':
                 case 'e':
                 case 'i':
                     sayac++;
                     break;
             }




         }
         return sayac ;
     }
}
