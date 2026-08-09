package Giris;

import java.util.Scanner;

public class Baslangic {
    static void main(String[] args) {
        double fiyat;
        Scanner deger = new Scanner(System.in);
        System.out.print("KDV'siz fiyatı giriniz: ");
        fiyat = deger.nextDouble();
        System.out.println("KDV'siz fiyatınız :" + fiyat);

        double KDVL;
        KDVL = fiyat * 1.18;
        System.out.println("KDV'li fiyatınız : " + KDVL);

        double KDV;
        KDV = fiyat * 0.18;
        System.out.println("KDV'niz : " + KDV);


    }
}