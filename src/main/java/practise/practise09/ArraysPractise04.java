package practise.practise09;

public class ArraysPractise04 {
    public static void main(String[] args) {
        //String bir array oluşturunuz 6 eleman ekle
        //yellowdan önceki elemanları yazdır
        String colors[] = new String[6];
        colors[0] = "red";
        colors[1] = "orange";
        colors[2] = "blue";
        colors[3] = "yellow";
        colors[4] = "green";
        colors[5] = "brown";

        for (String w : colors
        ) {
            if (w.equals("yellow")) {
                break;

            }
            System.out.println(w);


        }
    }
}
