package u07_Array;

import util.Zufall;

public class A03_WahrheitsArray {

    public static void main(String[] args) {

        boolean[] pasche = new boolean[10];

        for(int i = 0; i < 10; i++) {

            // könnte vereinfacht werden zu pasche[i] = Zufall.wuerfeln() == Zufall.wuerfeln();

            int wurf1 = Zufall.wuerfeln();
            int wurf2 = Zufall.wuerfeln();


            if(wurf1 == wurf2) { //pasch
                pasche[i] = true;
            } else {
                pasche[i] = false;
            }
        }

        for(int i = 0; i < 10; i++) {
            if(pasche[i]) {
                System.out.println("Wurf " + i + " war ein Pasch");
            } else {
                System.out.println("Wurf " + i + " war kein Pasch");
            }
        }
    }
}
