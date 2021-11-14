package u02_4_merfAuswahl;

import util.Eingabe;

public class A03_QuadrGlng {

    public static void main(String[] args) {
        double a = Eingabe.readDouble("A: ");
        double b = Eingabe.readDouble("B: ");
        double c = Eingabe.readDouble("C: ");

        // 0 = ax² + bx + c

        double sqrt = Math.sqrt(b * b - 4 * a * c);

        if(Double.isNaN(sqrt) || a == 0) {
            System.out.println("Keine Lösung");
            return;
        }

        double x1 = (-b + sqrt) / 2 * a;
        double x2 = (-b - sqrt) / 2 * a;

        System.out.printf("X1: %.3f X2: %.3f%n", x1, x2);
    }
}
