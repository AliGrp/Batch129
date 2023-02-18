package advancepractise.advancepractiseday07;

public class Isletme {

    static int kasa1;

    int deptn ;

    public void kasadandeptnaParaCikisi(int cikacakPara){

        deptn+=cikacakPara;
        kasa1 -= cikacakPara;
        System.out.println("Kasadan departman butcesi icin "+cikacakPara+"tl harcanmistir");

    }
    public void kasayaParaGirisi(int giricekPara){

        kasa1 += giricekPara;
        System.out.println("Kasaya "+giricekPara+"tl girmistir");

    }
    public void kasayaParaCikisi(int cikacakPara){

        kasa1 -= cikacakPara;
        System.out.println("Kasadan "+cikacakPara+"tl cikis olmustur");

    }
    public void kasadandeptnaParaGirisi(int depthgirecekPara){

        deptn+=depthgirecekPara;
        kasa1 += depthgirecekPara;
        System.out.println("Departmandan kasaya "+depthgirecekPara+"tl giris olmustur");

    }
}
