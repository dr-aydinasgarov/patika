package Beginn;

import java.util.Scanner;

public class Hypotenisus {
    static void main(String[] args) {
        int a, b;
        double c;

        Scanner h = new Scanner(System.in);
        System.out.print("Hipotenuzun 1-ci kateti: ");
        a = h.nextInt();
        System.out.print("Hipotenuzun 2-ci kateti: ");
        b = h.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println(c);
    }
}
