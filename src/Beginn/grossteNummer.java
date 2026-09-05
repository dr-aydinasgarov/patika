package Beginn;

import java.util.Scanner;

public class grossteNummer {
    static void main(String[] args) {
        int a,b,c,d=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Wie oft möchtest du die Zahlen eingeben: ");
        a = inp.nextInt();

        for (b=0; b<a; b++){
            System.out.print("Geben Sie die Nummer ein: ");
            c = inp.nextInt();
            if (c>d){
                d=c;
            }
        }
        System.out.println("Die größte Nummer ist: " + d);

    }
}
