package u03_Zaelschleife;

import util.Zufall;

public class Z07_Maximum {

    public static void main(String[] args) {
        int max = 0;

        for(int i = 0; i < 18; i++) {
            int z = Zufall.wuerfeln();
            System.out.println(z);
            max = Math.max(max, z);
        }

        System.out.println(max);
    }
}
