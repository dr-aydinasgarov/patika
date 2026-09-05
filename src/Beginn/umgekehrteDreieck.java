package Beginn;

import java.util.Scanner;

public class umgekehrteDreieck {
    static void main(String[] args) {
        int a, b, c = 0,d;
        Scanner inp = new Scanner(System.in);
        System.out.print("Geben Sie die Nummer der Zeile ein: ");
        a = inp.nextInt();
        d = a + (a - 1);

        for (b = d; b > 0; b -= 2) {
            while (b > 0) {
                System.out.print("*");
                b--;
            }
            b = d - (c * 2);
            c++;
            System.out.println("");
        }

    }
}
