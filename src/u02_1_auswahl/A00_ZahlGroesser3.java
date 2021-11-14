package u02_1_auswahl;

import util.Zufall;

public class A00_ZahlGroesser3 {

    public static void main(String[] args) {
        int res = Zufall.wuerfeln();

        System.out.println(res);
        if(res == 3)
            System.out.println("Du hast gewonnen");
        else
            System.out.println("'Du hast verloren");
    }
}
