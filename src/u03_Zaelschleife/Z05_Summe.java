package u03_Zaelschleife;

import util.Zufall;

public class Z05_Summe {

    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i < 20; i++) {
            sum += Zufall.wuerfeln();
        }

        System.out.println(sum);
    }
}
