package ssg_scope;

public class LocalVariableScope01 {
    public static void main(String[] args) {

        LocalVariableScope01 local = new LocalVariableScope01();
        local.show();
        System.out.println();

    }

    void show(){
        int x=12;
        System.out.println("x degeri "+ x);
        System.out.println();
        {
            System.out.println(x);
            int z =15;
        }

    }

}
