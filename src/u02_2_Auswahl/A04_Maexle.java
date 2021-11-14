package u02_2_Auswahl;

import util.Zufall;

public class A04_Maexle {

    public static void main(String[] args) {
        int w1 = Zufall.wuerfeln();
        int w2 = Zufall.wuerfeln();

        if(w1 + w2 == 3) {
            System.out.println("Mäxle");
        } else if(w1 == w2) {
            System.out.println("Pasch");
        } else {
            System.out.println("Verloren");
        }
    }
}
