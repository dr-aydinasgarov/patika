package Beginn;

import java.util.Scanner;

public class Zodiac {
    static void main(String[] args) {
        int Monate,Tage;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ihre Geburtsmonate: ");
        Monate = inp.nextInt();

        System.out.print("Ihre Geburtstage: ");
        Tage = inp.nextInt();

        if(Monate == 1 ) {
            if (Tage >= 22) {
                System.out.println("Ihre Zodiac ist: Wassermann");
            } else {
                System.out.println("Ihre Zodiac ist: Steinblock");
            }
        }else if(Monate == 2 ) {
            if (Tage >= 20) {
                System.out.println("Ihre Zodiac ist: Fische");
            } else {
                System.out.println("Ihre Zodiac ist: Wassermann");
            }
        }else if(Monate == 3) {
            if (Tage >= 21) {
                System.out.println("Ihre Zodiac ist: Widder");
            } else {
                System.out.println("Ihre Zodiac ist: Fische");
            }
        }else if(Monate == 4) {
            if (Tage >= 21) {
                System.out.println("Ihre Zodiac ist: Stier");
            } else {
                System.out.println("Ihre Zodiac ist: Widder");
            }
        }else if(Monate == 5) {
            if (Tage >= 22) {
                System.out.println("Ihre Zodiac ist: Zwillinge");
            } else {
                System.out.println("Ihre Zodiac ist: Stier");
            }
        }else if(Monate == 6) {
            if (Tage >= 23) {
                System.out.println("Ihre Zodiac ist: Krebs");
            } else {
                System.out.println("Ihre Zodiac ist: Zwillinge");
            }
        }else if(Monate == 7) {
            if (Tage >= 23) {
                System.out.println("Ihre Zodiac ist: Löwe");
            } else {
                System.out.println("Ihre Zodiac ist: Krebs");
            }
        }else if(Monate == 8) {
            if (Tage >= 23) {
                System.out.println("Ihre Zodiac ist: Jungfrau");
            } else {
                System.out.println("Ihre Zodiac ist: löwe");
            }
        }else if(Monate == 9) {
            if (Tage >= 23) {
                System.out.println("Ihre Zodiac ist: Waage");
            } else {
                System.out.println("Ihre Zodiac ist: Jungfrau");
            }
        }else if(Monate == 10) {
            if (Tage >= 23) {
                System.out.println("Ihre Zodiac ist: Skorpion");
            } else {
                System.out.println("Ihre Zodiac ist: Waage");
            }
        }else if(Monate == 11) {
            if (Tage >= 22) {
                System.out.println("Ihre Zodiac ist: Schütze");
            } else {
                System.out.println("Ihre Zodiac ist: Skorpion");
            }
        }else if(Monate == 12 ) {
            if(Tage>=22){
                System.out.println("Ihre Zodiac ist: Steinblock");
            }else {
                System.out.println("Ihre Zodiac ist: Schütze");
            }

        }
    }
}
