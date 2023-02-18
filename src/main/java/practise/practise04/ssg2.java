package practise.practise04;

public class ssg2 {
    public static void main(String[] args) {

        String t= "germany";

        for(int i=t.length()-1; i>=0; i--){
            char ch=t.charAt(i);

            if(ch=='e'){
                break;
            }

            System.out.print(ch);


        }


    }
}
