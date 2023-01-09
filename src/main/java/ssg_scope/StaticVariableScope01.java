package ssg_scope;

public class StaticVariableScope01 {

    static int x=15;
    static int y=15;
    public static void main(String[] args) {

        System.out.println(x);

    }

    public void print(){
        System.out.println(x);
    }
}
