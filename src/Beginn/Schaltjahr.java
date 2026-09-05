package Giris;

import java.util.Scanner;

public class Schaltjahr {
    static void main(String[] args) {
        int il, rest1, rest2, rest3;

        Scanner inp = new Scanner(System.in);

        System.out.print("Geben Sie die Jahre: ");
        il = inp.nextInt();
        rest1 = il%4;
        rest2 = il%400;
        rest3 = il%100;

        if (rest1 == 0 && rest3 != 0) {
            System.out.println("Das ist der Schaltjahr");
        }else if (rest2 == 0){
            System.out.println("Das ist der Schaltjahr");
        }else {
            System.out.println("Das ist kein Schaltjahr");
        }
    }
}
