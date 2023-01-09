package day08nestedifternary;

import java.util.Scanner;

public class Nestedİf03 {
    public static void main(String[] args) {
        /*
            Password'un ilk harfi buyuk harf ise
            'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin

            Passwordun ilk harfi kucuk harf ise
            'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
            A ==> gecerli
            B C Ç D E F G Ğ H İ I J K L M N O Ö P R S Ş T U Ü V Y Z==> gecersiz
            a b c ç d e f g ğ h i ı j k l m n o ö p r s ş t u ü v y ==> gecersiz
            z ==>gecerli
 */
        Scanner input = new Scanner(System.in);
        System.out.println("passwordunuz giriniz");
        String psw = input.nextLine();
        char firsChar = psw.charAt(0);

        if (firsChar >= 'A' && firsChar <= 'Z') {
            if (firsChar == 'A') {
                System.out.println("geçerli password");

            }else{
                System.out.println("harf büyük ama geçerli password değil");
            }
        } else if (firsChar>='a'&& firsChar<='z') {
            if(firsChar=='z'){
                System.out.println("password geçerli");
            }else{
                System.out.println("harf küçük ama password geçerli değil");
            }
        }



    }
}