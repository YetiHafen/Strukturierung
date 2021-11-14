package u02_1_auswahl;

import util.Zufall;

public class A07_EinSpielerPasch {

    public static void main(String[] args) {
        System.out.println(calc(Zufall.wuerfeln(), Zufall.wuerfeln()));
    }

    private static int calc(int wurf1, int wurf2) {
        if(wurf1 == wurf2) {
            if((wurf1 + wurf2) > 6) return 15;
            return 10;
        }
        if((wurf1 + wurf2) > 6) return 5;
        return 0;
    }
}
