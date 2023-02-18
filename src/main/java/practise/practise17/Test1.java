package practise.practise17;

public class Test1 extends Ab001 {
    int b =10;
    Test1(){
        b=super.b;
    }

    @Override
    void getNumber(int x, int y) {
        int i = x*y+b;
        System.out.println(i);
    }
}
