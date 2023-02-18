package practise.practiseinheritance;

public class BirdSeed {
   private int numberBags;
    boolean call;

    @Override
    public String toString() {
        return "BirdSeed{" +
                "numberBags=" + numberBags +
                ", call=" + call +
                '}';
    }

    public BirdSeed(){
        this.numberBags=11;
        call=false;
    }
    public BirdSeed(int numberBags){
        this.numberBags=numberBags;
        this.call=true;
    }

    public static void main(String[] args) {

    }
}
