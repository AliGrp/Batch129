package homework;

import java.util.Scanner;

public class TasKagitMakas03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] secenekler = {"tas", "kagit", "makas"};
        System.out.println("Oyunu sonlandırmak için v ye basınız");
        System.out.println("Tas,kagit,makas hangisini seçiyorsunuz");
       // String playerChoice = input.next().toLowerCase();
        int computerChoice = (int) (Math.random() * 3);
        String pcs = secenekler[computerChoice];


        do {
            String playerChoice = input.next().toLowerCase();
            if (playerChoice.equals("tas") || playerChoice.equals("kagit") || playerChoice.equals("makas")) {
                if (playerChoice.equals("tas") && pcs.equals("makas") || playerChoice.equals("makas") && pcs.equals("kagit")
                        || playerChoice.equals("kagit") && pcs.equals("tas")) {
                    System.out.println("playerChoice = " + playerChoice + " - " + "pcs = " + pcs);
                    System.out.println("KAZANDINIZ");

                }  else if (playerChoice.equals(pcs)) {
                    System.out.println("playerChoice = " + playerChoice + " - " + "pcs = " + pcs);
                    System.out.println("BERABERE");
                } else {
                    System.out.println("playerChoice = " + playerChoice + " - " + "pcs = " + pcs);
                    System.out.println("KAYBETTINIZ");

                }
            } else if (playerChoice.equals("v")){
                System.out.println("OYUN BİTTİ");
                break;
            }
            else {
                System.out.println("Yanlış girdiniz");
                break;
            }
        }while (true);
    }
}
