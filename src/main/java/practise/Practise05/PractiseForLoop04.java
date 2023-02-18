package practise.Practise05;

public class PractiseForLoop04 {
    public static void main(String[] args) {
        //interwiew question
        // String karakterleri teker teker yazdıran eğer
        //"a" karakterini görürse yazdırmayı durduran kodu yazınız

        String cümle= "öğrenmek yaşamın tek kanıtıdır";
       /* for(int i=cümle.length()-1; i>cümle.length()-4; i--){
            if(cümle.charAt(i)=='a'){
                break;
            }
            System.out.print(cümle.charAt(i));

        }

        */
        for(int i=0; i<cümle.length()-1; i++){

            if (cümle.charAt(i)=='a') {
                break;
            }
            System.out.print(cümle.charAt(i));
        }



    }
}
