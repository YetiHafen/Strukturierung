package u05_whileSchleife;

import util.Zufall;

public class W01_AnzahlBis6 {

    public static void main(String[] args) {
        int ergebnis = 0;
        int anzahl = 0;

        while (ergebnis != 6) {
            ergebnis = Zufall.wuerfeln();
            anzahl++;
        }

        System.out.println(anzahl);
    }
}
