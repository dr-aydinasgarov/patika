package Beginn;

import java.util.Scanner;

public class Taksimetre {
    static void main(String[] args) {
        int baslangic = 10;
        double km, kmbas = 2.2, sonuc;

        System.out.println("İndi-Bindi: " + baslangic + "TL");
        System.out.println("km başına ücret: " + kmbas + "TL");

        Scanner km1 = new Scanner(System.in);
        System.out.print("Gittiğiniz km: ");
        km = km1.nextDouble();
        System.out.println("Toplam km: " + km + " km");

        sonuc = baslangic + km * kmbas;

        boolean TL = sonuc > 20;
        String adalet = TL ? sonuc + "" : "20";
        // burada boolean yazmayıb String'də TL nin yerinə birbaşa "sonuc > 20" yazmaq da olardı
        System.out.println("Ödenecek tutar: " + adalet + "TL");
    }
}
