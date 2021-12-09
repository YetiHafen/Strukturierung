package u05_0_whileSchleife;

import util.Zufall;

public class W04_UND_ODER {

    public static void main(String[] args) {
        int punkte1 = 0;
        int punkte2 = 0;

        int wurf1 = 0;
        int wurf2 = 0;

        while(punkte1 < 5 && punkte2 < 5) {
            wurf1 = Zufall.wuerfeln();
            wurf2 = Zufall.wuerfeln();

            if(wurf1 > wurf2) {
                punkte1++;
            } else if(wurf1 < wurf2) {
                punkte2++;
            }
        }

        System.out.println("Spieler 1: " + punkte1 + " Spieler 2: " + punkte2);

    }
}
