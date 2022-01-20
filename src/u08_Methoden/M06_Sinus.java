package u08_Methoden;

import util.Eingabe;

public class M06_Sinus {

    private static final int GLIEDER = 10;

    public static void main(String[] args) {
        double x = Eingabe.readDouble("Zahl: ");
        System.out.println("sin(" + x + ") = " + sin(x));
        System.out.println("sin(" + x + ") = " + Math.sin(x));
    }


    public static double sin(double x) {
        double res = x;

        boolean plus = false;

        for(int i = 1; i < GLIEDER * 2; i += 2) {
            if(plus)
                res += Math.pow(x, i) / M04_Fakultaet.fakultaet(i);
            else
                res -= Math.pow(x, i) / M04_Fakultaet.fakultaet(i);
            plus = !plus;
        }

        return res;
    }
}
