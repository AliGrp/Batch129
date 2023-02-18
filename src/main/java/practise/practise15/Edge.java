package practise.practise15;

public class Edge extends Browser {
    String adresCubugu;
    public Edge() {
    }

    public Edge(String adresCubugu) {
        this.adresCubugu=adresCubugu;
    }

    @Override
    public void search() {
        System.out.println("Edge web sayfasinda arama yapar");
    }

    @Override
    public void sifreKaydetme() {
        System.out.println("Edge coociesleri kabul edilenlerin sifresini kayit eder"); 
    }

    public void adresCubugu() {
    }
}
