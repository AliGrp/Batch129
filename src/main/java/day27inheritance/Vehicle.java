package day27inheritance;

public class Vehicle {
    /*
    1) Child classtan bir object olusturdugunuzda constructorlar en ustteki parent classtan baslatilarak altta dogru calistirilir
    2) Child Classdaki constructordan Parent Classdaki v\constructora gidebilmek icin "super()" kullanirz
    3) Parent Classda birden fazla constructor varsa istenilen constructor, super() ifadesinin parantezi icine yazilan
    parametreler yardimi ile secilebilir
    4) Ayni Class icindeki constructorlari secmek icin this() kullanilir
        Ayni Classda birden fazla constructor varsa istenilen constructor, this() ifadesinin parantezi icine yazilan
    parametreler yardimi ile secilebilir
     5)"super()" ifadesini yazmak istege baglidir, yazmasaniz da Java sanki "super()" varmis gibi davranir.
          Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir
    6) "super()" ve "this()" ifadeleri her zaman ilk satirda olmak zorundadir
    7) Bir constructor'in icinde "super()" ve "this()" ifadeleri sadecec bir kere kullanilabilir
    8) Inheritanceda variablelari ve methodlari cagirmak icin "this" veya "super" kullanilir.//Interview sorularndan
        "this" ayni class icindeki variableri ve methodlari cagirmak icin kullanilir
        "super" parent class icindeki variableri ve methodlari cagirmak icin kullanilir
    9) Inheritancede object kullanarak variable cagirrsaniz objenin data typeni temsil eden classtan variable aramaya baslayiniz
    o classta yoksa parentlara bakiniz
    10)Inheritancede object kullanarak method cagirrsaniz objectin constructorini temsil eden classtan methodu aramaya baslayiniz
    o classta yoksa parentlara bakini

    OOP Principals:
    i)Inheritanc
    ii)Polymorphism: Method Overloading + Method Overriding
    iii)Encapsulation
    iv)Abstraction

     */

    public int price=12000;

    public void engine(){
        System.out.println("Vehicle engine... ");
    }
    public Vehicle(){

        System.out.println("Vahicle 1 ");
    }

    public Vehicle(int price){

        System.out.println("Vehicle 2: "+price);
    }
}
