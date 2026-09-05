package Beginn;

public class Palindromzahl {
    static String PalindromZahl(int Pal) {
        int a, b = 0, c;
        c = Pal;
        while (c > 0) {
            a = c % 10;
            b = (b * 10) + a;
            c /= 10;
        }
        if (b == Pal)
            return Pal + " ist eine Palindromzahl";
        else
            return Pal + " ist keine Palindromzahl";
    }

    static void main() {
        System.out.println(PalindromZahl(2212));
    }
}
