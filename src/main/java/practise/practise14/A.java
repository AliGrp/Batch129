package practise.practise14;

public class A {
    public static void main(String[] args) {
        B b = new B();
          b.m();//bad
        System.out.println(b.x);//20

        C c = new B();
        c.m();//
        System.out.println(c.x);

        

        C d = new C();
        c.m();//
        System.out.println(c.x);

        D child = new D();
        System.out.println("child = " + child.x);
        System.out.println("child.sayi = " + child.sayi);
        child.m();

    }

}
