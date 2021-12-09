package u05_0_whileSchleife;

import util.Zufall;

public class W00_wuerfelnBis6 {

    public static void main(String[] args) {
        int ergebnis = 0;

        while(ergebnis != 6) {
            ergebnis = Zufall.wuerfeln();
            System.out.println(ergebnis);
        }

    }
}
