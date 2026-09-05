package Beginn;

import java.util.Scanner;

public class Daire {
    static void main(String[] args) {
        double alan, a, r, pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz (r): ");
        r = inp.nextDouble();

        System.out.print("Merkezi açısının ölçüsünü giriniz (\u03B1): ");
        a = inp.nextDouble();

        alan = (pi * Math.pow(r, 2) * a)/360;
        System.out.println("Dairənin sahəsi: " + alan);

    }
}
