package Giris;

import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        int a,b,c=0,cc=1,ccc;
        Scanner inp = new Scanner(System.in);
        System.out.println("Geben Sie die Zahl ein: ");
        a = inp.nextInt();
        System.out.print("Die Fibonacci Nummer sind: ");
        for (b=1; b<=a; b++){
            ccc=cc+c;
            System.out.print(ccc + ",");
            c=cc;
            cc=ccc;
        }
    }
}
