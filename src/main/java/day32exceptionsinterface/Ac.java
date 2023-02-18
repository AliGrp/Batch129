package day32exceptionsinterface;

//interface'lerin icine "concrete" method konulamaz, cunku "concrete" method'larda
//body vardir ve body o method'un isi nasil yapacagini belirtir. Isin nasil yapilacagi
//bir cok detay icerir ve bu Child Class'larda kafa karisikligina sebep olur.
//Halbuki sadece yapilmasi gereken isi soyleyip nasil yapilacagini Child'a birakirsaniz
//Child Class'in kafa karisikligini engellemis olursunuz.

        //interface'ler "concrete" method iceremezler, dolayisiyla interface'in icindeki hicbirsey istege
        //bagli degildir, hersey Child Class'lar icin mecburidir. Bu yuzden interface'lere
        //"to-do list" de denir.

        //interface'lerdeki tum method'lar otomatik olarak "public"dir, "abstract"dir, "static" degildir.

//interface'lerdeki variabler otomatik olarak "public" dir, "static" dir, "final" dir
public interface Ac {
    //interfacelerin icine concerete method konulamaz
     void cool();
     void run();

     void digital();

      int price = 2000;
      String model = "Mitsubishi";



}
