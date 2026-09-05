package Beginn;

import java.util.Scanner;

public class Recursiv {
    static void rec(int a){
        System.out.print(a + ",");
        if (a<=0){
            return;
        }
        rec(a-5);

        System.out.print(a + ",");
    }
    static void main(String[] args) {
        int a;
        Scanner inp = new Scanner(System.in);
        System.out.println("Geben sie die Nummer ein: ");
        a = inp.nextInt();

        System.out.println("Die Antwort ist: ");
        rec(a);
    }
}
