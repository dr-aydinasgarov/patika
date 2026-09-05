package Beginn;

import java.util.Scanner;

public class KDV {
    static void main(String[] args) {
        double fiyat;
        Scanner deger = new Scanner(System.in);
        System.out.print("KDV'siz fiyatı giriniz: ");
        fiyat = deger.nextDouble();

        boolean kosul1 = fiyat <= 1000;
        boolean kosul2 = fiyat > 1000;

        double KDVLL;
        KDVLL = fiyat * 1.18;

        double KDVV;
        KDVV = fiyat * 0.18;

        double KDVL;
        KDVL = fiyat * 1.08;

        double KDV;
        KDV = fiyat * 0.08;

        String az1 = kosul1 ? "KDV'li fiyatınız : " + String.valueOf(KDVLL) : "";
        String az2 = kosul1 ? "KDV'niz : " + String.valueOf(KDVV) : "";
        String cox1 = kosul2 ? "KDV'li fiyatınız : " + String.valueOf(KDVL)  : "";
        String cox2 = kosul2 ? "KDV'niz : " + String.valueOf(KDV) : "";

        System.out.println("KDV'siz fiyatınız :" + fiyat);
        System.out.println(az1);
        System.out.println(az2);
        System.out.println(cox1);
        System.out.println(cox2);


    }
}