package day23statickryword;

import java.util.List;

public class StdRunner {
    public static void main(String[] args) {
        //stdNmae static oldugundan ona ulasmak icin object olusturmadim 
        //sadece class ismini kullanmak yeterlidir
        
        System.out.println("Student.stdName = " + Student.stdName);
        
        //age non-stattic oldugundan ona ulasmak icin object olustirmak zorundayiz
        Student std1 =new Student();
        System.out.println("std1.age = " + std1.age);

        Student std2 =new Student();
        System.out.println("std2.age = " + std2.age);
        std2.age=43;
        System.out.println("std2 = " + std2.age);


       String initials = Student.geInitials("Tom Cruise");
        System.out.println("initials = " + initials);
        
        Student obj1 = new Student();

       int countVowels = obj1.countVowels("aliGarip");
        System.out.println("countVowels = " + countVowels);


        //List olusturmada yeni bir yontem
       List<String> names = List.of("Ali","Veli","Kemal");
        System.out.println("names = " + names);
    }
}
