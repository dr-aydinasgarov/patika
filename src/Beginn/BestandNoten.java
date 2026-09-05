package Beginn;

import java.util.Scanner;

public class BestandNoten {
    public static void main(String[] args) {
        int Math, Physhik, Geohrafie, Geschihte, Musik, Durchschnitt = 0,Zahlen = 0, Resultat ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Geben Sie bitte Ihre MathNote ein: ");
        Math = inp.nextInt();
        if(Math > 0 && Math < 100) {
            System.out.println("Ihre Math Note ist: " + Math);
            Durchschnitt +=Math;
            Zahlen++;
        }else {
            System.out.println("Sie haben keine gültige Note eingegeben, dieses fach wird nicht berücksichtigt!  ");
        }
        System.out.print("Geben Sie bitte Ihre PhyshikNote ein: ");
        Physhik = inp.nextInt();
        if(Physhik > 0 && Physhik < 100) {
            System.out.println("Ihre Physhik Note ist: " + Physhik);
            Durchschnitt +=Physhik;
            Zahlen++;
        }else {
            System.out.println("Sie haben keine gültige Note eingegeben, dieses fach wird nicht berücksichtigt!  ");
        }
        System.out.print("Geben Sie bitte Ihre Geohrafie Note ein: ");
        Geohrafie = inp.nextInt();
        if(Geohrafie > 0 && Geohrafie < 100) {
            System.out.println("Ihre Geohrafie Note ist: " + Geohrafie);
            Durchschnitt +=Geohrafie;
            Zahlen++;
        }else {
            System.out.println("Sie haben keine gültige Note eingegeben, dieses fach wird nicht berücksichtigt!  ");
        }
        System.out.print("Geben Sie bitte Ihre Geschihte Note ein: ");
        Geschihte = inp.nextInt();
        if(Geschihte > 0 && Geschihte < 100) {
            System.out.println("Ihre Geschihte Note ist: " + Geschihte);
            Durchschnitt +=Geschihte;
            Zahlen++;
        }else {
            System.out.println("Sie haben keine gültige Note eingegeben, dieses fach wird nicht berücksichtigt!  ");
        }
        System.out.print("Geben Sie bitte Ihre Musik Note ein: ");
        Musik = inp.nextInt();
        if(Musik > 0 && Musik < 100) {
            System.out.println("Ihre Musik Note ist: " + Musik);
            Durchschnitt +=Musik;
            Zahlen++;
        }else {
            System.out.println("Sie haben keine gültige Note eingegeben, dieses fach wird nicht berücksichtigt! ");
        }

        Resultat = Durchschnitt/Zahlen;
        if(Resultat>=55){
            System.out.println("Sie haben erfolgreich bestanden");
        }else {
            System.out.println("Leider haben Sie nicht bestanden");
        }
        System.out.println("Ihre Durchschnittnote ist: " + Resultat);
    }
}
