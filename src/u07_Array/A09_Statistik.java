package u07_Array;

import util.Zufall;

public class A09_Statistik {

    public static void main(String[] args) {
        int[] ergebnisse = new int[6];

        for(int i = 0; i < 100; i++) {
            int wurf = Zufall.wuerfeln();
            ergebnisse[wurf - 1]++;
        }

        System.out.println(
                "1er: " + ergebnisse[0] + "\n2er: " + ergebnisse[1]
                + "\n3er: " + ergebnisse[2] + "\n4er: " + ergebnisse[3]
                + "\n5er: " + ergebnisse[4] + "\n6er: " + ergebnisse[5]
        );
    }
}
