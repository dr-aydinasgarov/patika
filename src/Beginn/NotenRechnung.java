package Giris;


import java.util.Scanner;

public class NotenRechnung {
    static void main(String[] args) {
        int math, physhik, chemie, historie, programmierung;
        Scanner not = new Scanner(System.in);

        System.out.print("Math Note: ");
        math = not.nextInt();

        System.out.print("Physhik Note: ");
        physhik = not.nextInt();

        System.out.print("Historie Note: ");
        historie = not.nextInt();

        System.out.print("Chemie Note: ");
        chemie = not.nextInt();

        System.out.print("Programmierung Note: ");
        programmierung = not.nextInt();

        double toplam = math + chemie + physhik + historie + programmierung;
        double sonuc = toplam / 5;
        System.out.println(sonuc);

        boolean kosul1 = 60 > sonuc;
        boolean kosul2 = 60 <= sonuc && sonuc < 80;
        boolean kosul3 = 80 <= sonuc;

        String ql = kosul1 ? "Nicht Bestanden" : "";
        System.out.println(ql);
        String ql1 = kosul2 ? "Bestanden" : "";
        System.out.println(ql1);
        String ql2 = kosul3 ? "Ausgezeichnet" : "";
        System.out.println(ql2);





    }
}
