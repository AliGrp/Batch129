package day24staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {

        Date myDate = new Date();
        System.out.println("myDate = " + myDate);//myDate = Sat Jan 07 23:26:42 EET 2023

        System.out.println(myDate.getTime());//1673123332778 ==> 1 ocak 1970 den su ana kadar ki mili sanie miktari

        //icinde bulundugunuz an nasil alinir?

        System.out.println("LocalDate = " + LocalDate.now());//2023-01-07
        System.out.println("LocalTime = " + LocalTime.now());// 23:34:54.521852900
        System.out.println("LocalDateTime = " + LocalDateTime.now());//2023-01-07T23:36:25.084684200

        //Dunyanin herhangi bir saat dilimindeki saati nasil aliriz
        System.out.println("LocalDateTime = " + LocalDateTime.now().atZone(ZoneId.of("Asia/Tokyo")));//2023-01-07T23:38:57.124876500+09:00
        System.out.println("LocalDateTime = " + LocalDateTime.now().atZone(ZoneId.of("Europe/Paris")));//2023-01-07T23:40:52.052093600+01:00

        //ileriki tarihe nasil gidilir
        System.out.println("LocalDate" + LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-12

        //geriki tarihe nasil gidilir
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(8));//2018-09-29

        //ileriki bir zamana nasil gidilir
        System.out.println(LocalTime.now().plusHours(3));//02:56:26.090382300

        //Geriki bir zamanan nasil gidilir
        System.out.println(LocalTime.now().minusMinutes(45));//23:13:27.294583200

        //zamanda belli bir bolumu nasil aliriz
        System.out.println(LocalTime.now().getHour() + " : " + LocalTime.now().getMinute());// 0:0

        //Tarihde belli bir bolumu nasil aliriz
        System.out.println(LocalDate.now().getMonth() + ":" + LocalDate.now().getDayOfMonth());//JANUARY:8
        System.out.println(LocalDate.now().getMonthValue() + ":" + LocalDate.now().getDayOfMonth());//1:8

        //Iki tarih nasil karsilastirilir
        // 02/13/2005 - 03/01/2007
        boolean result = LocalDate.of(2005,2,13).isBefore( LocalDate.of(2007,3,01));
        System.out.println(result);

        //Tarihlerin formatlari nasil degistirilir
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(LocalDate.now()));//08/01/2023

        DateTimeFormatter dtf1 =  DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(dtf1.format(LocalDate.now()));//08/Oca/2023


    }
}
