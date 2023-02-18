package day28overiding;

public class Cat extends Mammal {
    public void meow(){
        System.out.println("Cats meow");
    }

    @Override//Override Annototaion:Overrida kurallarini java taraifindan kontrol edilmesini saglar
    public void eat() {//Childeki override edilmis eat() methoduna "Overriding Method" denir
        System.out.println("Cats eat.. ");
    }

    @Override
    public void drink() {

        System.out.println("Cats drinks.. ");
    }

    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multipy(int a, int b) {
        return a*b;
    }
}
