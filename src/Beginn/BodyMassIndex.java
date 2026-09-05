package Beginn;

import java.util.Scanner;

public class BodyMassIndex {
    static void main(String[] args) {
        double boy, ceki, index;

        Scanner inp = new Scanner(System.in);
        System.out.print("Gewicht: ");
        ceki = inp.nextDouble();

        System.out.print("Körpergröße: ");
        boy = inp.nextDouble();

        index = ceki/(boy*boy);
        System.out.println("Ihre Body-Mass-Index ist: " + index);

        String norma = (18.5<index && index<=24.9) ? "Gesund" : "Ungesund";
        System.out.println("Ihre Gesundheitszustand: " + norma);

    }
}
