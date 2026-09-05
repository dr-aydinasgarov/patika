package Beginn;

import java.util.Scanner;

public class ggTkgV {
    static void main(String[] args) {
        // der größte gemeinsame Teiler (ggT), das kleineste gemensame Vielfache (kgV)
        int a, aa, b, bb,g=0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Die Zahlen für ggT");
        System.out.print("Geben Sie die erste Nummer ein: ");
        a = inp.nextInt();
        aa = a;
        System.out.print("Geben Sie die zweite Nummer ein: ");
        b = inp.nextInt();
        bb = b;

        while (a > 0) {
            while (aa % a == 0) {
                while (b > 0) {
                    while (bb % b == 0) {
                        if (a == b) {
                            System.out.println(" ");
                            System.out.println("der ggT ist: " + a);
                            g=a;
                            break;
                        }
                        break;
                    }
                    b--;

                }
                break;
            }
            b = bb;
            a--;
            if (g>0){
                break;
            }
        }

        System.out.println("das kgV ist: " + ((aa*bb)/g));


        // Kendimi geliştirmek için EKOK için de ayrıca formül hazırlamak istedim
        System.out.println(" \n");
        int z, zz, x, xx,y=0;
        System.out.println("Die Zahlen für kgV");
        System.out.print("Geben Sie die erste Nummer ein: ");
        z = inp.nextInt();
        zz = z;
        System.out.print("Geben Sie die zweite Nummer ein: ");
        x = inp.nextInt();
        xx = x;

        while (z <= zz * xx) {
            while (x <= zz * xx) {
                while (z == x) {
                    System.out.println("das kgV ist: " + z);
                    y=z;
                    break;
                }
                x += xx;
            }
            x = xx;
            z += zz;
            if(y>0){
                break;
            }
        }
    }
}

