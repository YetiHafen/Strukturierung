package u03_Zaelschleife;

import util.Zufall;

public class Z06_Mittelwert {



    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i < 15; i++) {
            int z = Zufall.wuerfeln();
            System.out.println(z);
            sum += z;
        }

        System.out.printf("Summe: %d, Mittelwert: %.2f%n", sum, ((float) sum) / 15);
    }
}
