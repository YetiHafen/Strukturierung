package u02_2_Auswahl;

import util.Eingabe;

public class A00_Groesser {

    public static void main(String[] args) {
        int zahl1 = Eingabe.readInt("Zahl 1: ");
        int zahl2 = Eingabe.readInt("Zahl 2: ");

        System.out.printf("%d > %d\n", Math.max(zahl1, zahl2), Math.min(zahl1, zahl2));
    }
}
