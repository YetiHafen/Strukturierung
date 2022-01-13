package u08_Methoden;

import util.Eingabe;

public class M01_Potenzen {

    public static void main(String[] args) {
        double basis = Eingabe.readDouble("Basis: ");
        int exponent = Eingabe.readInt("Exponent: ");
        double ergebnis = potenzieren(basis, exponent);
        System.out.println(basis + " hoch " + exponent + " = " + ergebnis);
    }

    private static double potenzieren(double basis,  int exponent) {
        double res = basis;

        for(int i = 0; i < exponent - 1; i++) {
            res *= basis;
        }
        return res;
    }
}
