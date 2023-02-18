package day26accesmodifiersinheritance;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eat..");
    }

    @Override
    public void drink() {
        System.out.println("Dog drink..");
    }

    public void bark(){
        System.out.println("Dogs bark... ");


    }
}
