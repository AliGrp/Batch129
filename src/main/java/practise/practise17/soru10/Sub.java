package practise.practise17.soru10;

public class Sub extends Aa{
//    @Override
//    int x=4;
//    int getSum() {
//        return x+x;
//    }


    int getSum() {
        int x=4;
        return x+x;
    }

    @Override
    int getSum(int x) {
        return x*x;
    }

    @Override
    int getSum(int x, int y) {
        int z = x+y;
        System.out.println(z);
        return z;
    }
}
