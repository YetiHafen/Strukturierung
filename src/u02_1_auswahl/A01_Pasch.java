package u02_1_auswahl;

import util.Zufall;

public class A01_Pasch {

    public static void main(String[] args) {
        int w1 = Zufall.wuerfeln();
        int w2 = Zufall.wuerfeln();

        if(w1 == w2)
            System.out.println("Pasch");
        else
            System.out.println("Kein Pasch");
    }
}
