package Beginn;

import java.util.Scanner;

public class whilePassword {
    static void main(String[] args) {
        String password;
        boolean zpassword = true;

        Scanner inp = new Scanner(System.in);
        System.out.print("Geben sie das Passwort ein: ");
        password = inp.nextLine();

        if (password.equals("Aydin123")) {
            System.out.println("Sie haben sich erfolgreich eingeloggt");
        }else {
            System.out.println("Das Passwort is falsch");
            while (zpassword) {
                System.out.print("Geben sie das Passwort nochmal ein: ");
                password = inp.nextLine();
                if (password.equals("Aydin123")) {
                    System.out.println("Sie haben sich erfolgreich eingeloggt");
                    zpassword = false;
                } else {
                    System.out.println("Das Passwort is falsch");
                }
            }
        }
    }
}
