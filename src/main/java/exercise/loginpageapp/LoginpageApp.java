package exercise.loginpageapp;

import java.util.Scanner;

public class LoginpageApp {
    /*

Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.

         menü: kullanıcıya işlem seçimi için menü gösterilir.

         üye olma(register): kullanıcıdan ad-soyad, kullanıcı adı, email ve şifre bilgileri alınız.
                             kullanıcı adı, email ve şifre birer listede tutulur.
                             aynı kullanıcı adı veya email kabul edilmez.

         giriş(login): kullanıcı adı/email ve şifre girilir.
                       kullanıcı adı veya email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
                       kullanıcı adı/email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.

         email validation: boşluk içermemeli
                         : @ içermeli
                         : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
                         : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.

         password validation: boşluk içermemeli
                            : en az 6 karakter olmalı
                            : en az bir tane küçük harf içermeli
                            : en az bir tane büyük harf içermeli
                            : en az bir tane rakam içermeli
                            : en az bir tane sembol içermeli
 */
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        UserService01 userService01 = new UserService01();
        Scanner inp = new Scanner(System.in);

        //1-Kullaniciya islem menusunu gosterelim
        int select;

        do{
            userService01.showMenu();
            select = inp.nextInt();
            switch (select){
                case 1:
                    userService01.register();
                    break;
                case 2:
                    userService01.login();
                    break;
                case 0:
                    System.out.println("Iyi Gunler Dileriz... ");
                    break;
                default:
                    System.out.println("Hatali Giris Yaptiniz, Tekrar Deneyiniz");
                    break;
            }

        }while (select!=0);
    }
}
