package homework;

public class NestedLoop {


    public static void main(String[] args) {
        
    
   /*
    |     **      |
    |    ****     |
    |   ******    |
    |*************|

    */

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("|");
                for (int k = 0; k < 5; k++) {
                    
                }
            }

            for (int j = 10; j >i ; j--) {
                System.out.print("*");

            }
            System.out.println("|");
        }



    }  
}
