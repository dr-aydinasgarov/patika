package Beginn;

import java.util.Scanner;

public class Primzahlen {
    static void main(String[] args) {
        int a,b=0,c=2;
        Scanner inp = new Scanner(System.in);
        System.out.println("Geben Sie die Nummer ein: ");
        a = inp.nextInt();

                System.out.print("Primzahlen bis " + a +" sind: ");
        for (b=2; b<a; b++){
            while (c<a){
                if(b%c==0){
                    break;
                }else {
                    c++;
                }
            }
            if(c==b){
                System.out.print(c + ",");
            }
            c=2;
        }
    }
}
