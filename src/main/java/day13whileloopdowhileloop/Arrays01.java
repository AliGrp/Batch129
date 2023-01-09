package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        String stdName[]= new String[5];
        System.out.println(Arrays.toString(stdName));
         stdName[2]= "AJDA";

        stdName[0]= "cüneyt";

        stdName[1]= "kemal";

        stdName[3]= "ezel";
        System.out.println(Arrays.toString(stdName));

        System.out.println(stdName[2]);

// Arraydeki her elamanın sonuna "!" işareti koyarak ekrana yazıdırn
        for( int i=0; i<stdName.length; i++){

            System.out.println(stdName[i]+"!");

        }


    }
}
