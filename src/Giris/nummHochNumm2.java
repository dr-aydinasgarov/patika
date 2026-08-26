package Giris;

import java.util.Scanner;

public class nummHochNumm2 {
    static void main(String[] args) {
        int b, c;
        long a, d;

        Scanner inp = new Scanner(System.in);
        System.out.print("Geben Sie die Nummer ein: ");
        a = inp.nextLong();
        d = a;

        System.out.print("Geben Sie die Hoch Nummer ein: ");
        b = inp.nextInt();

        for(c=2; c<=b; c++){
            d*=a;
        }
        System.out.println(d);
    }

}
