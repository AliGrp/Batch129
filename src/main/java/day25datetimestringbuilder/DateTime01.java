package day25datetimestringbuilder;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //Example 1: Time formatlayiniz

        LocalTime myTime = LocalTime.now();
        System.out.println("myTime = " + myTime);//21:39:47.150110800


        //hh==> 12 lik saat sistemini kullanir
        //HH==> 24LUK saat sisteminde kullanilir
        //hh==> kullandiginiz am ve pm demelisiniz, bunu demek icin 'a' yazmaniz yetrlidir
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");//09-42 OS
        System.out.println(dtf.format(myTime));


    }
}
