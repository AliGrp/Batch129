package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {
       String name="  ali cAN  ";
       char first = name.trim().toUpperCase().charAt(0);


        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(""+first+second);

        String str = "sd";
        boolean result1 = str.isEmpty();
        System.out.println(result1);

        boolean result2= str.length()==0;
        System.out.println(result2);

        String t = " ";
        boolean result3 = t.replace(" ","").length()==0;
        System.out.println(result3);

        boolean result4=t.isBlank();
        System.out.println(result4);

        String r = "Java is easy";
        int idxOfA= r.indexOf("J");
        int idxOfB= r.indexOf("e");
        int idxOfC= r.indexOf("i");
        System.out.println(""+(idxOfA+idxOfB+idxOfC));

        int idxOfD= r.lastIndexOf("s");
        int idxOfE= r.lastIndexOf("a");
        int idxOfF= r.lastIndexOf("y");
        System.out.println(idxOfD+idxOfE+idxOfF);


        String y = "abbccdc";
        char ch1=y.charAt(0);
        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);


        }
        char ch2 = y.charAt(1);
        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = y.charAt(5);
        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

        int ab1 = 958;
        if(ab1>99 && ab1<1000){
            System.out.println("woow");

            int n = 58;
            if(n>9&&n<99);
            System.out.println("siktir");
        }
    }
}
