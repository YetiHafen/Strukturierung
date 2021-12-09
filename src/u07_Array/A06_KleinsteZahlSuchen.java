package u07_Array;

import util.Eingabe;

public class A06_KleinsteZahlSuchen {

    public static void main(String[] args) {
        int[] zahlen = new int[20];

        for(int i = 0; i < 20; i++) {
            zahlen[i] = Eingabe.readInt("Zahl: ");
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < 20; i++) {
            min = Math.min(min, zahlen[i]);
        }

        System.out.println(min);
    }
}
