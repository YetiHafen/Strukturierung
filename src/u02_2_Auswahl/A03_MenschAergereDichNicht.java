package u02_2_Auswahl;

import util.Zufall;

public class A03_MenschAergereDichNicht {

    public static void main(String[] args) {
        int res = Zufall.wuerfeln();
        if(res != 6)
            System.out.printf("Leider nur eine %d\n", res);
        else
            System.out.println("Glückwunsch eine 6");
    }
}
