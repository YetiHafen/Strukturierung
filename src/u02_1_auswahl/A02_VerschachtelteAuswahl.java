package u02_1_auswahl;

import util.Zufall;

public class A02_VerschachtelteAuswahl {

    public static void main(String[] args) {
        int w1 = Zufall.wuerfeln();
        int w2 = Zufall.wuerfeln();

        if(w1 > w2)
            System.out.println("1 hat gewonnen");
        else if(w1 < w2)
            System.out.println("2 hat gewonnen");
        else
            System.out.println("Keiner hat gewonnen");
    }
}
