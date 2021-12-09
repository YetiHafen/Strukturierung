package u05_0_whileSchleife;

import util.Zufall;

public class W07_Bis10Punkte {

    public static void main(String[] args) {
        int punkte1 = 0;
        int punkte2 = 0;
        int count = 0;

        while(punkte1 < 10 && punkte2 < 10) {
            int wurf1 = Zufall.wuerfeln();
            int wurf2 = Zufall.wuerfeln();

            if(wurf1 > wurf2) {
                punkte1 += 2;
            } else if(wurf1 < wurf2) {
                punkte2 += 2;
            } else {
                punkte1++;
                punkte2++;
            }
            count++;
        }

        System.out.println("Runden: " + count + " Spieler 1: " + punkte1 + " Spieler 2: " + punkte2);
    }
}
