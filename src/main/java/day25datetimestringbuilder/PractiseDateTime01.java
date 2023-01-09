package day25datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PractiseDateTime01 {
    public static void main(String[] args) {
        LocalTime myTime = LocalTime.now();
        System.out.println("myTime = " + myTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(dtf.format(myTime));
    }
}
