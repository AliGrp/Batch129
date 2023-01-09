package day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {
        // size verilen bir stringi tersten yazdırın

        String n= "domates";
        String t= "";

        for(int i=n.length()-1; i>=0 ; i--){
            t=t+n.charAt(i);



        }
        System.out.println(t);

        // size verilen stringin palindrome olup olmadığını kontrolediniz
        // civic nalan küçük 11211 ==> Palindrom
        String r= "civic";
        String h="";
        // stringiters çevir sonrada düz hali ile ters hali karşılaştır
        // aynı ise palindrom de.

        for(int i=r.length()-1; i>=0 ; i--){
            h=h+r.charAt(i);


        }
        if(r.equalsIgnoreCase(h)){
            System.out.println(h+"string palindromdur");
        }else{
            System.out.println(h+"string palindrom değildir");
        }
    }







}
