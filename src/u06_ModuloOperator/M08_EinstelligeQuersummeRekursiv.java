package u06_ModuloOperator;

import util.Eingabe;

public class M08_EinstelligeQuersummeRekursiv {

    public static void main(String[] args) {
        int in = Eingabe.readInt("Zahl: ");
        System.out.println(einstelligeQuersumme(in));
    }

    private static int einstelligeQuersumme(int x) {
        int sum = 0;

        while(x != 0) {
            sum += x % 10;
            x /= 10;
        }
        if(sum >= 10)
            return einstelligeQuersumme(sum);
        else
            return sum;
    }
}
