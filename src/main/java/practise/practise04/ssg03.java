package practise.practise04;

public class ssg03 {
    public static void main(String[] args) {

        String str= "I love java";
        for(int i=0; i<str.length(); i++){

            char ch= str.charAt(i);

            if(ch=='a'){
                break;
            }
            System.out.print(ch);

        }
    }
}
