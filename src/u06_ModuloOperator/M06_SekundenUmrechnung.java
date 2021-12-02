package u06_ModuloOperator;

import util.Eingabe;

public class M06_SekundenUmrechnung {

    public static void main(String[] args) {
        int in = Eingabe.readInt("Sekunden: ");

        int sec = in % 60;
        in /= 60;
        int min = in % 60;
        in /= 60;
        int h = in % 24;
        in /= 24;
        int days = in;

        System.out.println(days + " Tage, " + h + " Stunden, " + min + " Minuten, " + sec + " Sekunden");
    }
}
