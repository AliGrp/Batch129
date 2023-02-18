package practise.practise19;

public class Test02 {
    String str = "a";
    void a() {
        try {
            str = str + "b";
            b();
        } catch (Exception e) {
            str = str + "c";
        }
    }
    void b() throws Exception {
        try {
            str = str + "d";
            c();
        } catch (Exception e) {
            str = str + "e";
        } finally {
            str = str + "f";
        }
        str = str + "g";
    }
    void c() throws Exception {
        System.out.println(12/0);
    }
    void display() {
        System.out.println(str);
    }
    public static void main(String[] args) {
        Test02 object = new Test02();
        object.a();
        object.display();//abdefg
    }

}