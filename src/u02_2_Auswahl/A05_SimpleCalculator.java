package u02_2_Auswahl;

import util.Eingabe;

public class A05_SimpleCalculator {

    public static void main(String[] args) {

        double a = Eingabe.readDouble("Zahl 1: ");
        char op = Eingabe.readChar("Operation: ");
        double b = Eingabe.readDouble("Zahl 2: ");

        System.out.printf("%f %c %f = %f%n", a, op, b, calc(a, b, op));
    }

    private static double calc(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            case '%': return a % b;
            default: return Double.parseDouble("NaN");
        }
    }
}
