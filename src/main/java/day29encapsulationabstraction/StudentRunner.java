package day29encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {

        //Student 1
        Student myStd =new Student();
        String stdId = myStd.getStdId();
        System.out.println("stdId = " + stdId);//AC123
        System.out.println("myStd.getGpa() = " + myStd.getGpa());
        System.out.println("myStd.isPoor() = " + myStd.isPoor());

        //Studen 2
        myStd.setGpa(4.0);
        System.out.println("myStd.getGpa = " + myStd.getGpa());//4.0
        myStd.setStdId("TH123");
        System.out.println(myStd.getStdId());
        myStd.setPoor(false);
        System.out.println(myStd.isPoor());

        //Objeye bakamdan tekrardan classtan obje olusturunca orjinalini gorur
        Student yourStd = new Student();
        System.out.println("yourStd.getGpa = " + yourStd.getGpa());
    }
}
