package day31exceptions;

public class Exceptions02 {
    /*
    "throw" ile "throws" keyword'leri arasindaki fark nedir?
            1)"throw" method body'si icinde, "throws" ise method paranetzinden hemen sonra kullanilir.
            2)"throw" method body'si icinde istenilen yerde istenildigi kadar kullanilir,
            "throws" ise method paranetzinden hemen sonra sadece bir kere kullanilabilir.
3)"throw" dan sonra "new" keyword ve "constructor" kullanilarak object olusturulur.
  "throws" dan sonra sadece Exception Class ismi yazilir
4)"throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application'i Exception attiktan sonra durdurur.

     */
    public static void main(String[] args) throws IllegalAccessException {

        try {
            printAge(90);
        }catch (IllegalAccessException e){
            System.out.println(e.getMessage());
        }
    }
    public static void printAge(int age) throws IllegalAccessException {

        if (age < 0) {
            throw new IllegalAccessException("Yas negatif olamaz");
        } else {
            System.out.println(age);
        }
        try {
            getMark(900);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
        //Ogrenci notlari girisi yapan ve notu console'a yazdiran bir method olusturunuz
        public static void getMark(double d){

            if(d<0){
                throw new IllegalArgumentException("Marks cannot be less than zero");
            }else if(d>100){
                throw new IllegalArgumentException("Marks cannot be greater than hundred");
            }else {
                System.out.println(d);
            }
    }
}
