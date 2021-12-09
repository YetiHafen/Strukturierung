package u07_Array;

import util.Eingabe;

public class A08_MaxMinMittelAbweichung {

    public static void main(String[] args) {
        int[] zahlen = new int[20];

        for(int i = 0; i < 20; i++) {
            zahlen[i] = Eingabe.readInt("Zahl: ");
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < 20; i++) {
            min = Math.min(min, zahlen[i]);
            max = Math.max(max, zahlen[i]);
            sum += zahlen[i];
        }

        int mid = sum / 20;
        int maxDiff = max - mid;
        int minDiff = mid - min;

        if(maxDiff > minDiff) {
            System.out.println("Mittelwert: " + mid + " Maximale Differenz zum Mittelwert: " + maxDiff);
        } else if(minDiff > maxDiff) {
            System.out.println("Mittelwert: " + mid + " Maximale Differenz zum Mittelwert: " + minDiff);
        } else {
            System.out.println("Mittelwert: " + mid + " Maximale Differenz zum Mittelwert: " + maxDiff);
        }
    }
}
