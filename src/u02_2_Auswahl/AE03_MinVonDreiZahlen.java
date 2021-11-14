package u02_2_Auswahl;

import util.Eingabe;

public class AE03_MinVonDreiZahlen {

    public static void main(String[] args) {
        int a = Eingabe.readInt("Zahl 1: ");
        int b = Eingabe.readInt("Zahl 2: ");
        int c = Eingabe.readInt("Zahl 3: ");

        System.out.printf("Min: %d%n", Math.min(Math.min(a, b), c));
    }
}
