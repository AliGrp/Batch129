package day24exercise;

public class Car1 {

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    @Override
    public String toString() {
        return "Car1{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }

    public Car1(String make, String model, int year, boolean hybrid) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    public Car1(String make, String model) {
        this.make = make;
        this.model = model;

        if (year==2023){
            this.year=0;
        }
        if (hybrid==true){
            this.hybrid=false;
        }
    }
}
