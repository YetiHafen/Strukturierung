package u02_1_auswahl;

import util.Zufall;

public class A05_ZweiSpielerMinGewinnt {

    public static void main(String[] args) {

        int s1 = Zufall.wuerfeln();
        int s2 = Zufall.wuerfeln();

        if(s1 > s2)
            System.out.println("2 hat gewonnen");
        else if(s1 < s2)
            System.out.println("1 hat gewonnen");
        else
            System.out.println("Keiner hat gewonnen");
    }
}
