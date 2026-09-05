package Giris;

import java.util.Scanner;

public class Kombination {
    static void main(String[] args) {
        int a, b, n = 1,m=1, r,s=1, Cnr, nr,e=1,f=1;

        Scanner inp = new Scanner(System.in);
        System.out.print("n = ");
        a = inp.nextInt();
        System.out.print("r = ");
        b = inp.nextInt();

        while (n <= a) {
            m *= n;
            n++;
        }
        System.out.println("n! = " + m);

        for (r = 1; r <= b; r++) {
            s*= r;
        }
            System.out.println("r! = " + s);
        nr = a-b;
        while (e<=nr) {
            f*=e;
            e++;
        }
        System.out.println("(n-r)! = " + f);

        Cnr = m/(s*f);
        System.out.println("Kombination C(n,r)/(r!(n-r)!) = " + Cnr);

    }
}
