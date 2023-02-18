package advancepractise.advancepractiseday07;

public class Sirket {

   static int kasa;
   int depButcesi;
   public void kasadanbutceyeParaAl(int alinacakPara){

       depButcesi+=alinacakPara;
       kasa-=alinacakPara;
       System.out.println("Kasadan "+alinacakPara+" lira alindi");
   }

   public void paraKazan(int kazanilanPara){
       kasa+=kazanilanPara;
       System.out.println(kazanilanPara+" lira kazanildi");

   }

   public static void kasadanParaHarca(int harcanacakPara){
       kasa-=harcanacakPara;
       System.out.println("Kasadan "+harcanacakPara+"lira kadar harcanda");
   }

   public void departmanHarcamasi(int harcanacakPara){
      depButcesi -= harcanacakPara;
       System.out.println("Departman Butcesinden ="+harcanacakPara+"lira harcandi");
   }
}
