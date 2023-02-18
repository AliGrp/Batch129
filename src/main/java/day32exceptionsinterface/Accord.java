package day32exceptionsinterface;

public class Accord implements Ac,Engine,Security{

    @Override
    public void cool() {
        System.out.println("Accord cools super");
    }

    @Override
    public void run() {
        System.out.println("Engine runs super");
    }

    @Override
    public void esp() {
        System.out.println("Esp mevcut");
    }

    @Override
    public void digital() {
        System.out.println("AC digital");
    }

    @Override
    public void hp() {
        System.out.println("Accord 155hp");
    }
}
