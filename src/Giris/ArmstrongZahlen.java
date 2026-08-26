package Giris;

import java.util.Scanner;

public class ArmstrongZahlen {
    static void main(String[] args) {
        int a, b, c = 1, d, e, bb = 0, cc = 0;
        double aa, dd;

        Scanner inp = new Scanner(System.in);
        System.out.print("Geben Sie die Nummer ein: ");
        a = inp.nextInt();
        aa = a;
        bb = a;

        while (aa > 0) {
            aa = aa % 10;
            dd = aa;
            d = a / 10;
            while (d > 0) {
                aa *= dd;
                d = d / 10;
            }
            cc += aa;
            e = bb / (c * 10);
            aa = e;
            c *= 10;
        }
        System.out.println("Die Summe ist: "+cc);
        if (cc == a){
            System.out.println("Die Nummer ist Armstrong!!");
        }else {
            System.out.printf("Die Nummer ist kein Armstrong!!");
        }
    }
}
