package day39lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class LambdaPractise02 {
    public static void main(String[] args) throws IOException {
        //LambdaTextFile dosyasi icindeki meni console yazdiran kodu yazdiriniz

        Files.lines(Paths.get("src/main/java/day39lambda/LambdaTextFile.txt")).
                forEach(System.out::println);

        //LambdaTextFile dosyasi icindeki her karakteri uppercase yapiniz

        Files.
                lines(Paths.get("src/main/java/day39lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);


        //LambdaTextFile dosyasi icinde herhangi bir kelimenin var olup olmadigini gosteren kodu yaziniz
        boolean result = Files.
                lines(Paths.get("src/main/java/day39lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                anyMatch(t->t.contains("Java"));

        System.out.println("result = " + result);


        //LambdaTextFile dosyasi icinde herhangi her kelimenin "a" var olup olmadigini gosteren kodu yaziniz
        boolean result2 = Files.
                lines(Paths.get("src/main/java/day39lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).allMatch(t->t.contains("a"));
        System.out.println("result2 = " + result2);

    }
}
