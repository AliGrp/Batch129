package day26accesmodifiersinheritance;

import day25datetimestringbuilder.Snake;

public class AnimalsRunner {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.mewo();
        myCat.drink();
        myCat.eat();

        Snake yourSnake = new Snake();
        yourSnake.tiss();
        yourSnake.eat();

        Dog myDog = new Dog();
        myDog.bark();
        myDog.eat();
        myDog.drink();
    }
}
