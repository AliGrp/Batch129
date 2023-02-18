package day39lambda;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) throws IOException {
        //LambdaTextFile dosyasi icindeki meni console yazdiran kodu yazdiriniz

        Files.
                lines(Paths.get("src/main/java/day39lambda/LambdaTextFile.txt")).
                forEach(System.out::println);

        //LambdaTextFile dosyasi icindeki her karakteri uppercase yapiniz

        Files.
                lines(Paths.get("src/main/java/day39lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);

        //LambdaTextFile dosyasi icinde herhangi bir kelimenin var olup olmadigini gosteren kodu yaziniz
        boolean result =Files.
                lines(Paths.get("src/main/java/day39lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).flatMap(Arrays::stream).
                anyMatch(t->t.contains("Java"));//her hangi bir kelime java ise true verir
        System.out.println("result = " + result);//true

        //LambdaTextFile dosyasi icinde herhangi her kelimenin "a" var olup olmadigini gosteren kodu yaziniz
        boolean result2 = Files.
                                    lines(Paths.get("src/main/java/day39lambda/LambdaTextFile.txt")).
                                     map(t->t.split(" ")).
                                        flatMap(Arrays::stream).
                                        allMatch(t->t.contains("a"));//her kelime a harfini iceriyorsa true verir
        System.out.println("result2 = " + result2);//false

        //LambdaTextFile dosyasi icinde herhangi hicbir kelimenin "x" var olup olmadigini gosteren kodu yaziniz
        boolean result3 = Files.
                lines(Paths.get("src/main/java/day39lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                noneMatch((t->t.contains("x")));
        System.out.println("result3 = " + result3);//true


        //6) LambdaTextFile dosyasi icinde "r" ile biten kelimeleri sayan kodu yaziniz

        long result4 = Files.
                lines(Paths.get("src/main/java/day39lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).count();
        System.out.println("result4 = " + result4);

        //2.yol tavsiye edilmez
        int result5 = Files.
                lines(Paths.get("src/main/java/day39lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).collect(Collectors.toList()).size();
        System.out.println("result4 = " + result4);
    }





}
