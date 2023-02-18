package day30exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
/*
  1)Exception demek beklenmedik problem demektir. Seyehatte benzinin bitmesi, arabanin bozulmasi gibi...
  2)Gercek hayatta karsilastigimiz beklenmedik problemler icin cozum yollarimiz vardir. Mesela benzin bitince
    yol yardimi arariz.
  3)Applicationlarda da beklenmedik problemler icin cozum yollari uretmeliyiz,bu isleme "Exception Handling" denir.
  4)Exception'lar temel olarak ikiye ayrilirlar.
    i)Compile Time Exception:Siz code yazarken fark edilir ve yazdiginiz kodun alti kirmizi cizgi ile cizilir
    ii)Run Time Exception:Siz code yazarken fark edilmez ama code u calistirdiginizda console da hata alirsiniz.
  5)Exceptionlar'lar disinda "error" diye adlandirdigimiz "handle edilemeyen" problemler vardir.
    Gercek hayatta soforun olmesi gibi handle edilemeyecek durumlar "Error" dur.
    Application'larda "Memory" nin dolmasi "Error" dur.
    Iki tur memory vardir;
    i)Stack Memory: dolarsa "StackMemoryFlow Error" alirsiniz.
    ii)Heap Memory: dolarsa "OutOfMemory Error" alirsiniz.





 */

   int a=12;
   int b =0;

   divide(a,b);
   divide2(a,b);

    }
    public static void divide(int a, int b){

        try {
            System.out.println(a / b);
        }catch(ArithmeticException e){
            System.out.println("Do not divide by zero");

        }
        System.out.println("tou are here");
    }
    public static void divide2(int a, int b){
        if (b==0){
            System.out.println("Do not divide by zero");
        }else {
            System.out.println(a/b);
        }
    }
}
