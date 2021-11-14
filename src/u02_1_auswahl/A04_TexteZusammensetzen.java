package u02_1_auswahl;

import util.Zufall;

public class A04_TexteZusammensetzen {

    public static void main(String[] args) {
        int s1 = Zufall.wuerfeln() + Zufall.wuerfeln();
        int s2 = Zufall.wuerfeln() + Zufall.wuerfeln();

        int s1p, s2p;

        if(s1 > s2) {
            s1p = 2;
            s2p = 0;
        } else if(s1 < s2){
            s1p = 0;
            s2p = 2;
        } else {
            s1p = 1;
            s2p = 1;
        }

        System.out.printf("Spieler 1: %d Punkte, Spieler 2: %d Punkte.", s1p, s2p);
    }
}
