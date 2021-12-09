package u07_Array;

import util.Eingabe;
import util.Zufall;

public class A04_ZahlMitIndexSuchen {

    public static void main(String[] args) {
        int[] namen = new int[20];

        for(int i = 0; i < 20; i++) {
            namen[i] = Zufall.hundert();
        }
        int idx = Eingabe.readInt("Idx: ");

        if(idx >= 0) {
            if(idx < 20) {
                System.out.println(namen[idx]);
            } else {
                System.out.println("Keine gültige Eingabe");
            }
        } else {
            System.out.println("Keine gültige Eingabe");
        }

    }
}
