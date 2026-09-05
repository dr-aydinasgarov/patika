package Giris;

import java.util.Scanner;

public class PotenzierenRekursiv {
    static int pot(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static void main(String[] args) {
        int a, b;
        Scanner inp = new Scanner(System.in);
        System.out.print("Geben Sie eine Nummer ein: ");
        a = inp.nextInt();
        System.out.print("Geben Sie eine Potenz ein: ");
        b = inp.nextInt();

        System.out.println(pot(a,b));

    }
}
