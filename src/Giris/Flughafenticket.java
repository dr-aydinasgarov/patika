package Giris;

import java.util.Scanner;

public class Flughafenticket {
    static void main(String[] args) {
        double KM, Alt, Flugtype, Preis, Rabatt, Rabatt2;

        Scanner inp = new Scanner(System.in);

        System.out.print("Wie viele KM beträgt die Flugstrecke: ");
        KM = inp.nextInt();

        if(KM < 0){
            System.out.println("Sie haben FALSCH eingegeben !!!");
        }
        System.out.print("Wie alt sind Sie: ");
        Alt = inp.nextInt();

        if(Alt < 0){
            System.out.println("Sie haben FALSCH eingegeben !!!");
        }

        System.out.print("Welche Flugart passt zu Ihnen?\n1. Hinflug\n2. Hin und Rückflug\nIhre Flugart: ");
        Flugtype = inp.nextInt();

        if (Flugtype == 1 || Flugtype == 2) {
            System.out.println(" Alles ist richtig !!");
        } else {
            System.out.println("Sie haben FALSCH eingegeben !!!");

        }

        Preis = KM * 0.1;
        System.out.println("Der Ticketspreis ist: " + Preis);

        if(Alt < 12) {
            Rabatt = Preis * 0.5;
        } else if (Alt > 12 && Alt < 24) {
            Rabatt = Preis * 0.1;
        } else {
            Rabatt = Preis * 0.3;
        }
        Preis -= Rabatt;

        if (Flugtype == 2) {
            Rabatt2 = Preis * 0.2;
        } else {
            Rabatt2 = 0;
        }
        Preis -= Rabatt2;

        System.out.println("der total Ticketspreis ist: " + Preis);

    }
}
