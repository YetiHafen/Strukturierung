package u05_whileSchleife;

import util.Zufall;

public class W05_SumGroesser20 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        while (sum <= 20) {
            sum += Zufall.wuerfeln();
            count++;
        }

        System.out.println(count);
    }
}
