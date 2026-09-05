package Giris;

import java.util.Scanner;

public class erweiterteTaschenrechner {

    static int add(int b, int c) {
        int result = b + c;
        System.out.println("Die Antwort ist: " + result);
        return result;
    }

    static int sub(int b, int c) {
        int result = b - c;
        System.out.println("Die Antwort ist: " + result);
        return result;
    }

    static double div(double b, double c) {
        if(c==0){
            System.out.println("Zweite nummer muss größer als 0 sein!!");
            return 0;
        }
        double result = b / c;
        System.out.println("Die Antwort ist: " + result);
        return result;
    }

    static int mul(int b, int c) {
        int result = b * c;
        System.out.println("Die Antwort ist: " + result);
        return result;
    }

    static int pot(int b,int c){
        int result = 1;
        for (int i=1; i<=c; i++){
            result*=b;
        }
        return result;
    }

    static int mod(int b, int c){
        int result = b%c;
        return result;
    }

    static void rechteck(int b, int c){
        System.out.println("Die Flache des Rechtecks ist: " + b*c );
        System.out.println("Der Umfang des Rechtecks ist: " + 2*(b+c) );
    }

    static void main(String[] args) {
        int a, b, c;
        Scanner inp = new Scanner(System.in);
        String menu = "1. Addition\n"
                + "2- Subtraktion\n"
                + "3- Division\n"
                + "4- Multiplikation\n"
                + "5- Potenz berechnen\n"
                + "6- Modulo berechnen\n"
                + "7- Fläche und Umfang des Rechtecks berechnen\n"
                + "8- Beenden\n";

        while (true) {
            System.out.println(menu);
            System.out.print("Wählen Sie bitte aus: ");
            a = inp.nextInt();
            if (a == 0){
                System.out.println("Das System ist beendet");
                break;}
            if (a<0 || a>8) {
                System.out.println("Sie haben die ungültige Operation eingegeben!!\n");
                continue;
            }
            System.out.print("Die erste Nummer ist: ");
            b = inp.nextInt();
            System.out.print("Die zweite Nummer ist: ");
            c = inp.nextInt();

            switch (a) {
                case 1:
                    add(b, c);
                    System.out.println(" ");
                    break;
                case 2:
                    sub(b, c);
                    System.out.println(" ");
                    break;
                case 3:
                    div(b, c);
                    System.out.println(" ");
                    break;
                case 4:
                    mul(b, c);
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("Die Antwort ist: " + pot(b,c));
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println("Die Antwort ist: " + mod(b,c));
                    System.out.println(" ");
                    break;
                case 7:
                    rechteck(b,c);
                    break;

            }
        }
    }
}
