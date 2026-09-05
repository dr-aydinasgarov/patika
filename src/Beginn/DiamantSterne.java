package Beginn;

import java.util.Scanner;

public class DiamantSterne {
    static void main(String[] args) {
        int n,i,m,k=0,l,s=2;

        Scanner inp = new Scanner(System.in);
        System.out.print("Geben Sie die Nummer ein: ");
        n = inp.nextInt();

        for (i=1; i<=n; i++){
            k++;
            for(m=n-k; m>0; m--){
                System.out.print(" ");
            }
            for (l=n*2-s; l<n*2-1; l++)
            System.out.print("*");
            s+=2;
            System.out.println("");

        }
        s-=4;
        for (i=1; i<n; i++){
            k--;
            for(m=n-k; m>0; m--){
                System.out.print(" ");
            }
            for (l=n*2-s; l<n*2-1; l++)
            System.out.print("*");
            s-=2;
            System.out.println("");

        }
    }
}
