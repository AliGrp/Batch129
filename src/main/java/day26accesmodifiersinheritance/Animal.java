package day26accesmodifiersinheritance;

public class Animal {
/*
    Inheritance'in faydalari;
    1) Code standardında tekrar iyi değildir.
    2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
    3) Gelişime update'e açık olmalıdır
    4) Code atomic yapıda olmalı.
    Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
    Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
    NoTE 3: "public" methodlar child claslar tarafindan kullanilabilir
            "child classlar tarafindan kullanilabilir" demek inherit edilebilir demektr
    Note 4: "protected" methodlar "inherit" edilebilir.
            cunku "protecred" olan method ve variblelar child tarafindan kullanilabilir

    Note 5: "default" methodlar object ile ayni package olduklari surece "inherit edilebilir".
            Ama default method ile objectin uretildigi class farkli package'lerde ise inherit edilemezler
    Note 6: "private" methodlar "inherit edilemezler".
    Note 7: Java "birden fazla parent" i onaylamaz
    Note 8: Child --> Parent --> Grand Grand Parent.. seklinde ilerleyen inheritancelara "Multi Level Inheritance" denir.
    Note 9: Javada object class tum java classlarinin ortak parentidir.
    Note 10: Javada object class haric tum classlarin parenti vardir.Javada parenti olmayan tek clas object classtir
    Note 11: Javada parenttan childa olan iliskilere "has a" --> "relationship" denir
            Javada "child" dan "parent"a olan iliskilere "is-a" "relationship" denir
    Note 12: Javada her classin bir tane default constructor'i vardir
            Bu default constructur classin icinde gorunmez cunku default constructur object class icindedir
            Bizim classimiz default constructor'a ihtiyac duydugunda parent olan "Object Class" a gider ve orada
            constructor'i kullanir
 */


    public  void eat(){
        System.out.println("Animals eat...");
    }
      public void drink(){
        System.out.println("Animals drink...");
    }
}
