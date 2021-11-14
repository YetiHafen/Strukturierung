package u02_2_Auswahl;

import util.Eingabe;

public class AE02_PunktAufGerade {

    public static void main(String[] args) {
        int x = Eingabe.readInt("X: ");
        int y = Eingabe.readInt("Y: ");

        if((x * 5 - 3) == y) {
            System.out.println("Der Punkt liegt auf der Gerade y = 5x -3");
        } else
            System.out.println("Der Punkt liegt nicht auf der Gerade y = 5x - 3");
    }
}
