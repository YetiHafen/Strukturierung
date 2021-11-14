package u02_2_Auswahl;

import util.Eingabe;

public class AE06_Dreieck {

    public static void main(String[] args) {
        int a = Eingabe.readInt("Seite a: ");
        int b = Eingabe.readInt("Seite b: ");
        int c = Eingabe.readInt("Seite c: ");

        int max = Math.max(a, Math.max(b, c));

        boolean dreieck;

        if(a == max)
            dreieck = a < b + c;
        else if(b == max)
            dreieck = b < a + c;
        else
            dreieck = c < a + b;

        if(dreieck)
            System.out.println("Dreieck Möglich");
        else
            System.out.println("Kein Dreieck Möglich");
    }
}
