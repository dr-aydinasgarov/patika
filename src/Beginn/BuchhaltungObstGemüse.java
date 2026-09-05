package Beginn;

import java.util.Scanner;

public class BuchhaltungObstGemüse {
    static void main(String[] args) {
        double Birne = 5.14, Apfel = 2.17, Banane = 2.64, Tomaten= 3.41, Aubergine = 4.40;
        double Birnekg, Apfelkg, Bananekg, Tomatenkg, Auberginekg;
        double Birneprs, Apfelprs, Bananeprs, Tomatenprs, Aubergineprs;

        Scanner inp = new Scanner(System.in);

        System.out.print("Wie viel kg Apfel: ");
        Apfelkg = inp.nextDouble();

        System.out.print("Wie viel kg Birne: ");
        Birnekg = inp.nextDouble();

        System.out.print("Wie viel kg Banane: ");
        Bananekg = inp.nextDouble();

        System.out.print("Wie viel kg Tomaten: ");
        Tomatenkg = inp.nextDouble();

        System.out.print("Wie viel kg Aubergine: ");
        Auberginekg = inp.nextDouble();



        Apfelprs = Apfelkg * Apfel;
        System.out.println("Zahlung des Apfels ist: " + String.format("%.2f", Apfelprs) + " Euro");
       Birneprs = Birnekg * Birne;
        System.out.println("Zahlung der Birne ist: " + String.format("%.2f", Birneprs) + " Euro");
       Bananeprs = Bananekg *Banane;
        System.out.println("Zahlung der Banane ist: " + String.format("%.2f", Bananeprs) + " Euro");
        Aubergineprs = Auberginekg * Aubergine;
        System.out.println("Zahlung der Aubergine ist: " + String.format("%.2f", Aubergineprs) + " Euro");
        Tomatenprs = Tomatenkg * Tomaten;
        System.out.println("Zahlung der Tomate ist: " + String.format("%.2f", Tomatenprs) + " Euro");
    }
}
