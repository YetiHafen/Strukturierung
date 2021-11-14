package u02_2_Auswahl;

import util.Eingabe;

public class AE04_Versandgeschaeft {

    public static void main(String[] args) {
        double in = Eingabe.readDouble("Preis: ");

        if(in <= 0) {
            System.out.println("Das macht keinen Sinn");
            return;
        }

        if(in < 100) {
            in += 5;
        } else if(in < 200) {
            in += 2;
        }

        System.out.printf("Finaler Preis: %s", in);
    }
}
