package day13whileloopdowhileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //while-loop ==> aşağıdaki işlemden dolayı while body hiç çalışmadı while loopda Zero Execution mümkündür.
        int i=1;
        while (i<1){
            System.out.println("Sen bir while loopsun");
            i++;
        }
        //do-while-loop ==> do while body çalışt. do whle da en az bir kere çalışır. do whileda zero execution mümkün değil
        int k=1;
        do{
            System.out.println("Sen bir do while loop'sun");
            k++;

        }while (k<1);



    }
}
