package Giris;

import java.util.Scanner;

public class Login {
    static void main(String[] args) {
        String passwort, benutzername, neuep, neueb;
        int ändern;

        Scanner inp = new Scanner(System.in);
        System.out.print("Geben Sie Ihr Benutzername ein: ");
        benutzername = inp.nextLine();

        System.out.print("Geben Sie Ihr Passwort ein: ");
        passwort = inp.nextLine();

        if (benutzername.equals("Aydin") && passwort.equals("Asgarov")) {
            System.out.println("Sie haben sich erfolgreich eingeloggt");
        } else {
            System.out.println("Möchten Sie ihre Anmeldeinformationen ändern?");
            System.out.println("1.Ja\n2.Nein");
            System.out.print("Antwort: ");
            ändern = inp.nextInt();

            switch (ändern) {
                case 1:
                    inp.nextLine(); // bunu buraya qoyanda aşağıdakı kodlar eyni anda yox sıra ilə gəlir və hər ikisinə yazmaq olur
                    System.out.print("Geben Sie bitte neue Benutzernummer ein: ");
                    neueb = inp.nextLine();
                    System.out.print("Geben Sie bitte neue Passwort ein: ");
                    neuep = inp.nextLine();
                    if (neueb.equals("Aydin") || neuep.equals("Asgarov")) {
                        System.out.println("Sie können die alten Anmeldeinformationen nicht verwenden");
                    } else {
                        System.out.print("Sie haben Ihre Anmeldeinformationen erfolgreich geändert");
                    }
                    break;
                case 2:
                    inp.nextLine(); // bunu buraya qoyanda aşağıdakı kodlar eyni anda yox sıra ilə gəlir və hər ikisinə yazmaq olur
                    System.out.print("Geben Sie Ihr Benutzername ein: ");
                    benutzername = inp.nextLine();

                    System.out.print("Geben Sie Ihr Passwort ein: ");
                    passwort = inp.nextLine();
                    break;
            }
        }

    }
}
