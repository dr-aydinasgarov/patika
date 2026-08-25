package Giris;

import java.util.Scanner;

public class nummerSum {
    static void main(String[] args) {
        int a, b=0, c;

        Scanner inp = new Scanner(System.in);


        do {
            System.out.print("Geben Sie die Nummer ein: ");
            a = inp.nextInt();
            if (a%2==0){
            b += a;}
        } while (a%2 == 0);
        System.out.println("Die Summe der Zahlen ist: " + b);
    }

}
