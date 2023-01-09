package day23statickryword;

public class PractiseC04_Static {
    public static void main(String[] args) {

        System.out.println(PractiseC03_StaticDepo.gymCenter);
        
        PractiseC03_StaticDepo obj1= new PractiseC03_StaticDepo();
        System.out.println("obj1.uye = " + obj1.uye);

        PractiseC03_StaticDepo.gymCenter = "Veli Gym Center";
        System.out.println("PractiseC03_StaticDepo.gymCenter = " + PractiseC03_StaticDepo.gymCenter);

        PractiseC03_StaticDepo obj2= new PractiseC03_StaticDepo();
        obj2.uye="Firat Kirat";
        System.out.println("obj2 = " + obj2.uye);
        obj2.uye="uras";
        obj1.uye="mehmet";
        System.out.println(obj1.uye +" "+ obj2.uye);
    }
}

