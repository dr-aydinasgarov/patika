package Beginn;

import java.util.Scanner;

public class GeldAutomat {
    static void main(String[] args) {
        String user, pass;
        Scanner inp = new Scanner(System.in);
        int richtigkeit = 3, wahlen,ein,ab;
        double konto = 10000;

        while (richtigkeit > 0) {
            System.out.print("Geben Sie ihre UserName ein: ");
            user = inp.nextLine();
            System.out.print("Geben Sie ihre Passwort ein: ");
            pass = inp.nextLine();
            if (user.equals("Aydin123") && pass.equals("Aydin321")) {
                System.out.println("Sie haben erfolgreich eingeloggen");
                System.out.println(" ");
                break;
            } else {
                System.out.println("UserName oder Passwort ist faslch");
                richtigkeit--;
            }
        }
        while (richtigkeit > 0) {
            while (richtigkeit == 0) {
                break;
            }
            System.out.println("1. Geld einzahlen\n2. Geld abheben\n3. Kontostand befragen\n4. Abmelden");
            System.out.print("Wählen Sie bitte: ");
            wahlen = inp.nextInt();

            switch (wahlen) {
                case 1:
                    System.out.print("Wie viel Geld möchten Sie einzahlen: ");
                    ein = inp.nextInt();
                    System.out.println("Sie haben " + ein + "$ eingezahlt");
                    konto+=ein;
                    System.out.println("Ihre Kontostand ist: " + konto + "$");
                    break;
                case 2:
                    System.out.print("Wie viel Geld möchten Sie abheben: ");
                    ab = inp.nextInt();
                    System.out.println("Sie haben " + ab + "$ abgehoben");
                    konto-=ab;
                    System.out.println("Ihre Kontostand ist: " + konto + "$");
                    break;
                case 3:
                    System.out.println("Ihre Kontostand ist: " + konto + "$");
                    break;
                case 4:
                    System.out.println("Sie haben erfolgreich abgemeldet");
            }
            System.out.println(" ");
            if (wahlen==4){
                break;
            }
        }
    }
}
