package day14arraysforeachloop;

public class Arrays04 {
    public static void main(String[] args) {
        //String bir array oluşturunuz 6 eleman ekle
        //yellowdan önceki elemanları yazdır
        String colors[]= new String[6];
        colors[0]="red";
        colors[1]="orange";
        colors[2]="blue";
        colors[3]="yellow";
        colors[4]="green";
        colors[5]="brown";

        for(String w : colors){
            if(w.equals("yellow")){
                break;

            }
            System.out.println(w);

            System.out.println();
        }
//yellowdan sonrakilei yazdırın
        String color[]= new String[6];
        color[0]="red";
        color[1]="orange";
        color[2]="blue";
        color[3]="yellow";
        color[4]="green";
        color[5]="brown";

        for(int i=color.length-1; i>=0; i--){
            if(color[i].equals("yellow")){
                break;
            }
            System.out.println(color[i]);
        }

    }
}
