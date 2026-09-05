package Beginn;

import java.util.Scanner;

public class abc {
    static void main(String[] args) {
        int a,b,c;

        Scanner inp = new Scanner(System.in);

        System.out.print("Geben Sie Ihre erste nummer ein: ");
        a = inp.nextInt();

        System.out.print("Geben Sie Ihre zweite nummer ein: ");
        b = inp.nextInt();

        System.out.print("Geben Sie Ihre dritte nummer ein: ");
        c = inp.nextInt();

        if(a>b && a>c) {
            System.out.println("die großte nummer ist: " +a);
        }else if(b>a && b>c) {
            System.out.println("die großte nummer ist: " +b);
        } else {
            System.out.println("die großte nummer ist: " +c);
        }

        if(a>b && a<c || a<b && a>c) {
            System.out.println("zweite großte nummer ist: " +a);
        } else if (b>a & b<c || b<a && b>c) {
            System.out.println("zweite großte nummer ist: " +b);
        } else {
            System.out.println("zweite großte nummer ist: " +c);
        }

        if (a<b && a<c){
            System.out.println("die kleinste nummer ist: " +a);
        } else if (b<a && b<c) {
            System.out.println("die kleinste nummer ist: " +b);
        } else {
            System.out.println("die kleinste nummer ist: " +c);
        }
    }
}
