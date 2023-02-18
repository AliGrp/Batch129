package exercise.loginpageapp;

import exercise.exerciseminiproje01.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService01 {

    List<String> userNameList = new ArrayList<>();
    List<String> emailList = new ArrayList<>();
    List<String> passswordList = new ArrayList<>();

    public void showMenu() {
        System.out.println("==TECHPROEDUCATION===");
        System.out.println("1-Uye Ol");
        System.out.println("2-Giris Yap");
        System.out.println("3-Cikis");
        System.out.println("Secimizi giriniz:");
    }

    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen AD ve SOYAD Giriniz");
        String name = sc.nextLine();

        String username;
        boolean existUsername;

        do {
            System.out.println("Kullanici adini giriniz");
            username = sc.nextLine();
            existUsername = userNameList.contains(username);
            if (existUsername) {
                System.out.println("Bu username daha once kullanilmistir. Yeniden deneyiniz");
            }


        } while (existUsername);


        String email;
        boolean existEmail;
        boolean isValid;

        do {
            System.out.println("Email Giriniz");
            email = sc.nextLine();
            isValid = validateEmail(email);
            existEmail = emailList.contains(email);

            if (existEmail) {
                System.out.println("Bu mail daha once kullanilmistir");
                isValid = false;

            }
        } while (!isValid);

        String password;
        boolean isValidPsw;

        do {
            System.out.println("Sifre giriniz");
            password = sc.nextLine();
            isValidPsw = validatePassword(password);

        } while (!isValidPsw);

        User user = new User(name, username, email, password);
        System.out.println(user);
        userNameList.add(username);
        emailList.add(email);
        passswordList.add(password);
        System.out.println("Tebrikler kayir islemi gerceklesti");
        System.out.println("Kullanici adi veya sifre ile giris yapabilirsiniz.");

    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Email yada kullanici adi giriniz");
        String usernameOrEmail = scanner.nextLine();

        boolean isEmail = emailList.contains(usernameOrEmail);
        boolean isUsername = usernameOrEmail.contains(usernameOrEmail);

        if (isEmail || isUsername) {

            while (true) {
                System.out.println("Sifre giriniz");
                String password = scanner.nextLine();
                int idx;

                if (isUsername) {
                    idx = userNameList.indexOf(usernameOrEmail);
                } else {
                    idx = emailList.indexOf(usernameOrEmail);
                }

                if (passswordList.get(idx).equals(password)) {
                    System.out.println("Sisteme Giris Yaptiniz!!!!");
                    break;
                } else {
                    System.out.println("Sifre yanlis. Tekrar deneyiniz.");
                }
            }
        } else {
            System.out.println("Sisteme kayitli kullanici bulunamadi.");
            System.out.println("Bilgilerinizi kontrol ediniz yada uye olunuz");
        }


    }


    public static boolean validateEmail(String email) {
        boolean isValid;

        boolean space = email.contains(" ");
        boolean isContainAt = email.contains("@");

        if (space) {
            System.out.println("Email bosluk icermemeli");
            isValid = false;
        } else if (!isContainAt) {
            System.out.println("Email @ icermelidir");
            isValid = false;
        } else {
            String firstPart = email.split("@")[0];
            String secondPart = email.split("@")[1];

            boolean checkFirst = firstPart.replaceAll("[A-Za-z0-9-._]", "").length() == 0;
            boolean checkSecond = secondPart.equals("gmail.com") ||
                    secondPart.equals("yahoo.com") ||
                    secondPart.equals("hotmail.com");

            if (!checkFirst) {
                System.out.println("Email büyük-küçük harf,rakam yada -._ karakterler disinda karakter iceremez");
            } else if (!checkSecond) {
                System.out.println("Email gmail.com,hotmail.com veya yahoo.com ile bitmeli.");
            }


            isValid = checkFirst && checkSecond;

        }
        return isValid;
    }

    public static boolean validatePassword(String password) {
        boolean isValid;

        boolean space = password.contains(" ");
        boolean lengthGt6 = password.length() >= 6;
        boolean existUpper = password.replaceAll("[^A-Z]", "").length() > 0;
        boolean existLower = password.replaceAll("[^a-z]", "").length() > 0;
        boolean existDigit = password.replaceAll("[\\D]", "").length() > 0;
        boolean existSymbol = password.replaceAll("[\\P{Punct}]", "").length() > 0;

        if (space) {
            System.out.println("Sifre bosluk iceremez");
        } else if (!lengthGt6) {
            System.out.println("Sifre en az 6 karakter icermelidir");
        } else if (!existUpper) {
            System.out.println("Sifre en az 1 buyuk harf icermelidir");
        } else if (!existLower) {
            System.out.println("Sifre en az 1 kucuk harf icermelidir");
        } else if (!existDigit) {
            System.out.println("Sifre en az 1 rakam icermelidir");
        } else if (!existSymbol) {
            System.out.println("Sifre en az 1 sembol icermelidir");
        }

        isValid = !space && lengthGt6 && existUpper && existLower && existDigit && existSymbol;

        return isValid;


    }
}