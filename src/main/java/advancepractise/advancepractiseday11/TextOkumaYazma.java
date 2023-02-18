package advancepractise.advancepractiseday11;

import java.io.*;

public class TextOkumaYazma {
    //Bir text dosyasındaki her satırın kelime sayısını o dosyada her satırın sonun yazdıran bir kod yazınız.
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("C:/Users/ASUS/Desktop/HelloWorld.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);//satir satir okumak icin bufferreader
        String satir = bufferedReader.readLine();
        String yeniDosya="";

        while (satir!=null){

            yeniDosya+=satir+"==> Satir Kelime Sayisi: "+satir.split(" ").length+"\n";

            satir=bufferedReader.readLine();//tum ssatirlari okur
        }
        System.out.println("yeniDosya = " + yeniDosya);
        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("C:/Users/ASUS/Desktop/TechProTxt..txt");
        fileWriter.write(yeniDosya);
        fileWriter.close();
    }
}
