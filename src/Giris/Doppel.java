package Giris;

import java.util.Scanner;

public class Doppel {
    static void main(String[] args) {

        //mit while

        int Nummer, k = 1, a = 0, durch = 0, resultat;

        Scanner inp = new Scanner(System.in);
        System.out.print("Geben Sie die Nummer ein: ");
        Nummer = inp.nextInt();

        while (k <= Nummer) {
            if (k % 3 == 0 || k % 4 == 0) {
                a += k;
                durch++;
            }
            k++;

        }
        resultat = a / durch;
        System.out.println(resultat);

        // mit for

        int Nammer, t = 1, b = 0, durc = 0, resulta;

        Scanner ind = new Scanner(System.in);
        System.out.print("Geben Sie die Nummer ein: ");
        Nammer = inp.nextInt();

        for (t = 1; t <= Nammer; t++) {
            if (t % 3 == 0 || t % 4 == 0) {
                b += t;
                durc++;
                continue;
            }

        }
        resulta = b / durc;
        System.out.println(resulta);


    }
}

