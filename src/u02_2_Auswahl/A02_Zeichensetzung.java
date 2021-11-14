package u02_2_Auswahl;

import util.Eingabe;

public class A02_Zeichensetzung {

    public static void main(String[] args) {
        String s = Eingabe.readString("Satz: ");
        if(s.endsWith("."))
            System.out.println("mit punkt");
        else
            throw new IllegalArgumentException("Satz wurde nicht durch einen Punkt abgeschlossen!");
    }
}
