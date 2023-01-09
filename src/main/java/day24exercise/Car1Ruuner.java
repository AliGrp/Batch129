package day24exercise;

public class Car1Ruuner {
    public static void main(String[] args) {

        Car1 c1 = new Car1("BMW","M8",2023,false);
        Car1 c2 = new Car1("AUDI","Rs8",2023,false);
        Car1 c3 = new Car1("TOYOTA","CHR",2023,true);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        Car1 c4 =new Car1("Honda","Civic");
        System.out.println(c4);

    }
}
