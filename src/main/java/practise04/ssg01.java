package practise04;

public class ssg01 {
    public static void main(String[] args) {
        String slymn="earn java learn money";

        for(int i=slymn.length()-1; i>=0; i--){

            char ch= slymn.charAt(i);
            if(ch=='a'){
                break;

            }



            System.out.print(ch);
        }
    }
}
