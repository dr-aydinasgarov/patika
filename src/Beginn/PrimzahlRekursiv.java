package Giris;

import java.util.Scanner;

public class PrimzahlRekursiv {

    static int prim(int a){
        for (int b=2; b<a; b++){
            if (a%b==0){
                System.out.println(a + " ist nicht der Primzahl");
                return 0;
            }
        }
        System.out.println(a + " ist der Primzahl");
        return 1;
    }
    static void main(String[] args) {
        int a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Geben Sie die Nummer ein: ");
        a = inp.nextInt();

        prim(a);

    }
}
