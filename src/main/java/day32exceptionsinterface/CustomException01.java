package day32exceptionsinterface;

public class CustomException01 {


  /*
 1)Kendi application'iniza ozel kurallar olusturmak icin kendi "Exception Class" larinizi olusturabilirsiniz.
 2)Olusturdugunuz "Exception Class" lar;
   i)Compile Time Exception
   ii)Run Time Exception olabilir.
 3)"Compile Time Exception" olusturmak icin class'inizin parent'i "Exception Class" olmalidir.
 4)"Run Time Exception" olusturmak icin class'inizin parent'i "RuntimeException Class" olmalidir.
 5)Kendi olusturdugumuz Exception Class'lara "Custom Exception Class" denir.
*/

    public static void main(String[] args) {
        getStudentGrade(120);

        getTheNumberOfStudents(900);
    }
    public static void getStudentGrade(int grade){
        if (grade<0 || grade>100){
            try {
                throw new InvalidStudentGradeException("Student grades cannot be less than zero or grater than 100");
            } catch (InvalidStudentGradeException e) {

            }
        }else {
            System.out.println(grade);
        }
    }
    public static void getTheNumberOfStudents(int numOfStudent){
        if (numOfStudent<0) {
        try{

            throw new InvalidNumberException("STUDENT NUMBER CANNOT BE NEGEATIVE");
        }catch(InvalidNumberException e){
                System.err.println(e.getMessage());//hata mesajlarini err ile yazdiririz
            }
        }else {
            System.out.println(numOfStudent);
        }
    }
}
