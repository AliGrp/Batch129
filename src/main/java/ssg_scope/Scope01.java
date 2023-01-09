package ssg_scope;

public class Scope01 {

    int x = 12; //instance variable
    public static void main(String[] args) {

        int y = 15; //Local variable

        Scope01 obje = new Scope01();
        System.out.println(obje.x);
        print();
    }

    public static void print(){
        int z =19;
        System.out.println(z);

    }
}
