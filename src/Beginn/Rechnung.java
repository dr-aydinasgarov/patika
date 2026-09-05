package Beginn;

import java.util.Scanner;

public class Rechnung {
    static void main(String[] args) {

        double n1, n2;
        int ausw;

        Scanner inp = new Scanner(System.in);
        System.out.print("Geben Sie Ihre Nummer ein: ");
        n1 = inp.nextDouble();

        System.out.print("Geben Sie Ihre zweite Nummer ein: ");
        n2 = inp.nextDouble();

        System.out.println("1. Addition\n2. Substraktion\n3. Multiplikation\n4. Division");

        System.out.print("Wahlen Sie bitte aus: ");
        ausw = inp.nextInt();

        switch (ausw) {
            case 1:
                System.out.println("Antwort: " + (n1+n2));
                break;
            case 2:
                System.out.println("Antwort: " + (n1-n2));
                break;
            case 3:
                String sfr = (n2 != 0) ? "Antwort: " + (n1*n2) : "Antwort: " + 0 ;
                System.out.println(sfr);
                break;
            case 4:
                String nul = (n2 != 0) ? "Antwort: " + (n1/n2) : "Antwort: " + 0;
                System.out.println(nul);
                break;
            default:
                System.out.println("Error");
        }
    }
}