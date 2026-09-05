package Giris;

import java.util.Scanner;

public class ChinaZodiac {
    static void main(String[] args) {
        int Zodiac, Jahre;

        Scanner inp = new Scanner(System.in);
        System.out.print("Geben Sie Ihre Geburtsjahre: ");
        Jahre = inp.nextInt();
        Zodiac = Jahre%12;

        switch (Zodiac){
            case 0:
                System.out.println("Ihre Chinesische Zodiac ist Affe");
                break;
            case 1:
                System.out.println("Ihre Chinesische Zodiac ist Hahn");
                break;
            case 2:
                System.out.println("Ihre Chinesische Zodiac ist Hund");
                break;
            case 3:
                System.out.println("Ihre Chinesische Zodiac ist Schwein");
                break;
            case 4:
                System.out.println("Ihre Chinesische Zodiac ist Ratte");
                break;
            case 5:
                System.out.println("Ihre Chinesische Zodiac ist Ochse");
                break;
            case 6:
                System.out.println("Ihre Chinesische Zodiac ist Tiger");
                break;
            case 7:
                System.out.println("Ihre Chinesische Zodiac ist Hase");
                break;
            case 8:
                System.out.println("Ihre Chinesische Zodiac ist Drache");
                break;
            case 9:
                System.out.println("Ihre Chinesische Zodiac ist Schlange");
                break;
            case 10:
                System.out.println("Ihre Chinesische Zodiac ist Pferd");
                break;
            case 11:
                System.out.println("Ihre Chinesische Zodiac ist Ziege");
        }
    }
}
