package Beginn;

import java.util.Scanner;

public class DieLufttemperatur {
    static void main(String[] args) {
        int temperatur;

        Scanner inp = new Scanner(System.in);
        System.out.print("Wie hoch ist die Temperatur: ");
        temperatur = inp.nextInt();

        if(temperatur<=5){
            System.out.println("Sie dürfen Kajak fahren");
        } else if (temperatur>5 && temperatur<15) {
            System.out.println("Sie dürfen ins Kino gehen");
        } else if (temperatur>15 && temperatur<25) {
            System.out.println("Sie dürfen Picknick machen");
        } else{
            System.out.println("Sie dürfen schwimmen gehen");
        }
    }
}
