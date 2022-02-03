package u08_Methoden;

import util.Eingabe;

public class Z21_Messwerte_Array {

    public static void main(String[] args) {
        double[] werte = new double[100];

        int maxIdx = werte.length;

        for(int i = 0; i < werte.length; i++) {
            double in = Eingabe.readDouble("Messwert " + i + " : ");
            if(in == 0) {
                maxIdx = i;
                break;
            }
            werte[i] = in;
        }

        double mittelwert = mittelwert(werte, maxIdx);
        double max = max(werte);
        double min = min(werte, maxIdx);

        System.out.println("Mittelwert: " + mittelwert + " Max: " + max + " Min: " + min);

    }

    public static double max(double[] werte) {
        double max = Double.MIN_VALUE;
        for(double wert : werte) {
            max = Math.max(max, wert);
        }
        return max;
    }

    public static double min(double[] werte, int length) {
        double min = Double.MAX_VALUE;
        for(int i = 0; i < length; i++) {
            min = Math.min(min, werte[i]);
        }
        return min;
    }

    public static double summe(double[] werte) {
        double summe = 0;
        for (double wert : werte) {
            summe += wert;
        }
        return summe;
    }

    public static double mittelwert(double[] werte) {
        return mittelwert(werte, werte.length);
    }

    public static double mittelwert(double[] werte, int length) {
        return summe(werte) / length;
    }
}
