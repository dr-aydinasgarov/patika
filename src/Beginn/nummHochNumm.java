package Beginn;

import java.util.Scanner;

public class nummHochNumm {
    static void main(String[] args) {
        int a, b = 1, c = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Geben Sie die Nummer ein: ");
        a = inp.nextInt();

        // while - mixed ^4 und ^5

        while (b < a) {
            System.out.println(b);
            b *= 4;
            if (c < a) {
                System.out.println(c);
                c *= 5;
            }

        }

        // for - getrennt ^4 und ^5

        int aa, bb, cc;

        System.out.print("Geben Sie die Nummer ein: ");
        aa = inp.nextInt();

        for (bb = 1; bb < aa; bb *= 4) {
            System.out.println(bb);
        }
        for (cc = 1; cc < aa; cc *= 5) {
            System.out.println(cc);
        }

    }
}
