package u08_Methoden;

import util.Eingabe;

public class M06_Sinus {

    public static void main(String[] args) {
        double x = Eingabe.readDouble("Zahl: ");
        System.out.println("sin(" + x + ") = " + sin(x));
        System.out.println("sin(" + x + ") = " + Math.sin(x));
    }


    public static double sin(double x) {
        double res = x;

        res -= Math.pow(x, 3) / M04_Fakultaet.fakultaet(3);
        res += Math.pow(x, 5) / M04_Fakultaet.fakultaet(5);
        res -= Math.pow(x, 7) / M04_Fakultaet.fakultaet(7);
        return res;
    }
}
