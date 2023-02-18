package advancepractise.advancepractiseday11.practise_maas;

public class MaasHesapla implements Vergi,MaasArttir{

    @Override
    public double yillikEkstra(int calismaYili) {
        if (calismaYili>=2) {

            return (calismaYili-2)*100;
        }else {
            return 0;
        }
    }

    @Override
    public double saatlikEkstra(int calismaSaati) {
        if (calismaSaati>=160) {
            return (calismaSaati-160)*10;
        }else{
            return 0;
        }
    }

    @Override
    public double vergi(double brutMaas, int calismaYili) {
        if (calismaYili>=10){
            return brutMaas * 0.30;
        }else {
            return brutMaas*0.20;
        }
    }

    public double netMaas(double brutMaas, int calismaSaati,int calsimaYili){
        return brutMaas+yillikEkstra(calsimaYili)+saatlikEkstra(calismaSaati)-vergi(brutMaas,calsimaYili);
    }

}
