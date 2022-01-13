package u08_Methoden;

import util.Eingabe;

public class M02_Pythagoras {

    public static void main(String[] args) {
        double a = Eingabe.readDouble("A: ");
        double b = Eingabe.readDouble("B: ");
        double c = Eingabe.readDouble("C: ");

        double diaAB = hypotenuse(a, b);
        double diaBC = hypotenuse(b, c);
        double diaAC = hypotenuse(a, c);

        double diaRaum = hypotenuse(diaAB, c);

        System.out.println("Diagonale A-B: " + diaAB);
        System.out.println("Diagonale B-C: " + diaBC);
        System.out.println("Diagonale A-C: " + diaAC);
        System.out.println("Raumdiagonale: " + diaRaum);
    }

    private static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
}
