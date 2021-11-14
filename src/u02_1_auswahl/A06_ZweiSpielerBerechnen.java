package u02_1_auswahl;

import util.Zufall;

public class A06_ZweiSpielerBerechnen {

    public static void main(String[] args) {

        int s11 = Zufall.wuerfeln();
        int s12 = Zufall.wuerfeln();

        int s1 = Math.max(s11, s12) - Math.min(s11, s12);

        int s21 = Zufall.wuerfeln();
        int s22 = Zufall.wuerfeln();

        int s2 = Math.max(s21, s22) - Math.min(s21, s22);

        if(s1 > s2)
            System.out.println("1 hat gewonnen");
        else if(s1 < s2)
            System.out.println("2 hat gewonnen");
        else
            System.out.println("Keiner hat gewonnen");
    }
}
