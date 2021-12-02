package u06_ModuloOperator;

import util.Eingabe;

public class M08_EinstelligeQuersumme {

    public static void main(String[] args) {
        int eingabe = Eingabe.readInt("Zahl: ");
        int einstelligeSumme = 0;
        int zwischensumme;

        do {
            zwischensumme = 0;
            while(eingabe != 0) {
                zwischensumme += eingabe % 10;
                eingabe /= 10;
            }
            einstelligeSumme += zwischensumme;

        } while (zwischensumme >= 10);

        System.out.println(einstelligeSumme);
    }
}
