package u02_2_Auswahl;

import util.Eingabe;

public class AE01_Kehrwert {

    public static void main(String[] args) {
       int in = Eingabe.readInt("Zahl: ");

        try {
            System.out.printf("Kehrwert: %d%n", 1/in);
        } catch (ArithmeticException e) {
            System.out.println("Es gibt keinen Kehrwert");
        }
    }
}
