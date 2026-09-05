package Giris;

import java.util.Scanner;

public class vollkommeneNummer {
    static void main(String[] args) {
        int a, aa, b=0, c;
        Scanner inp = new Scanner(System.in);
        System.out.print("Geben Sie die Nummer ein: ");
        a = inp.nextInt();
        aa = a;
        a-=1;

        while (a > 0) {
            while (aa % a == 0) {
                b+=a;
                break;
            }
            a--;
        }
        if(aa == b){
            System.out.println(aa + " ist die vollkommene Nummer");
        }else {
            System.out.println(aa + " ist keine vollkommene Nummer");
        }
    }
}
