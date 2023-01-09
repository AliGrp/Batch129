package day23statickryword;

public class C01_Overloading {
    public static void main(String[] args) {
        toplama(3,5);
        toplama(3.6,5);
        toplama((float) 3.69,5);

        cikarma(40,10);
        cikarma(40,10,5);
        carpma(0.8,2);

    }//main //methoda data tyoe yazmadik o yuzden uyariyor galiba hocam


    // Overloadin Yaapma Yontemleri

    // 1)Parametlerin Data Typplerini degistirerek

    public static void toplama(int a, int b){
        System.out.println("Iki int ile toplama : "+(a+b));
   }
    public static void toplama(double a, int b){
        System.out.println("Iki int ile toplama : "+(a+b));
    }
    public static void toplama(float a, int b){
        System.out.println("Iki int ile toplama : "+(a+b));
    }

    //Parametrelerin sayisini degistirerek overloading
    public static void cikarma(int a, int b){
        System.out.println("Iki int ile cikarma : "+(a-b));
    }
    public static void cikarma(int a, int b, int c){
        System.out.println("Iki int ile cikarma : "+(a-b-c));
    }

    // 3) Data typelarin yerini degistirerek Overloading
    public static void carpma(double a, int b){
        System.out.println( "double ve int ile carpma : "+(a*b));
    }
}
