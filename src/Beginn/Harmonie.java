package Giris;

import java.util.Scanner;

public class Harmonie {
    static void main(String[] args) {
        double a,b=0,c=0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Geben Sie die Nummer ein: ");
        a = inp.nextDouble();

        while (a>b){
            b++;
            c+=(1/b);
        }
            System.out.println(c);

    }
}

