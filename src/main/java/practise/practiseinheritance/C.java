package practise.practiseinheritance;

public class C extends B{
    public C(){
        System.out.println("Class C Constructor");

    }
    public C(String s){
        super(1.2);
        System.out.println("Class C String Constructor");

    }
}
