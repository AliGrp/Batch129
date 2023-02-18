package advancepractise.advancepractiseday10.practise_okul;

import java.util.Scanner;

public class SchoolMain {
       /*
    1- Değişkenleri ad, soyad, yaş olan bir Ogrenci pojo class'ı oluşturunuz.

     2- Değişkenleri okulAd, maxOgrenciSayisi, ArrayList cinsinden Öğrencileri olan bir Okul pojo class oluşturunuz

     3- Main metodunun olduğu OkulMain isimli bir class oluşturunuz.

     4- Bir okul objesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci ekleyiniz.
        Fakat oluşturacağınız öğrencilerin yaşı 15'i geçmemeli, 8'den küçük olmamalı.
        Bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
     */
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           School school=new School();
           System.out.println("okul adini gir");
           school.setOkulAdi(input.nextLine());
           System.out.println("kac ogrenci");
           school.setMaxStd(input.nextInt());


           for (int i = 1; i <= school.getMaxStd() ; i++) {
               input.nextLine();
               Student student = new Student();
               System.out.println(i+"ogrenci ismini gir");
               student.setAd(input.nextLine());
               System.out.println(i+"soyadini gir");
               student.setSoyad(input.nextLine());
               System.out.println(i+"yasini gir");

               try{
               student.setYas(input.nextInt());
               if (student.getYas()<=8||student.getYas()>=15) {
                   throw new ArithmeticException();

               }
               }catch (ArithmeticException e) {
                   System.out.println("yas araligini 8-15 giriniz ");
                   i--;
                   continue;
               }catch (Exception e){
                   System.out.println("Gecerli bir sayi giriniz");
                   i--;
                   continue;
               }

               school.addOgrenciToList(student);

               }
           System.out.println(school);
       }
}
