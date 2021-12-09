package u05_0_whileSchleife;

import util.Eingabe;
import util.Zufall;

public class W10_ZahlRaten {

    public static void main(String[] args) {
        int zahl = Zufall.hundert();
        int guess = -1;

        while(guess != zahl) {
            guess = Eingabe.readInt(">>> ");
            if(guess > zahl)
                System.out.println("Kleiner");
            else if(guess < zahl)
                System.out.println("Größer");
            else
                System.out.println("Richtig");
        }
    }
}
