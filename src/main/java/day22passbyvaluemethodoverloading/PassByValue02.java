package day22passbyvaluemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {
        String name = "Tom Hanks";

       String updateName =  updateName(name, "Jr.");
        System.out.println("name = " + name);
        System.out.println("updateName = " + updateName);
        name = updateName(name,"Jr.");
        System.out.println("name = " + name);


    }
    public static String updateName(String name, String add){

       name = name + " " + add;

        return name;
    }
}
