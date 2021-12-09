package u07_Array;

import util.Eingabe;

public class A07_ZahlSuchen {

    public static void main(String[] args) {

        int[] zahlen = new int[20];

        for(int i = 0; i < 20; i++) {
            zahlen[i] = Eingabe.readInt("Zahl: ");
        }

        int suchen = Eingabe.readInt("Zahl zu suchen: ");
        int count = 0;
        for(int i = 0; i < 20; i++) {
            if(zahlen[i] == suchen) {
                System.out.println("Gefunden an stelle: " + i);
                count++;
            }
        }
        System.out.println(count + " mal gefunden");
    }
}
