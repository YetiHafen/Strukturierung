package u10_MehrdimArrays;

import util.Zufall;
import util.Eingabe;

public class MD01_TabelleFuellen {

    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        for(int y = 0; y < 10; y++) {
            for(int x = 0; x < 10; x++) {
                arr[x][y] = Zufall.hundert();
            }
        }
        System.out.println("Fertig");

        int search = Eingabe.readInt("Zahl eingeben: ");

        int occurences = 0;
        for(int y = 0; y < 10; y++) {
            for(int x = 0; x < 10; x++) {
                if(arr[x][y] == search) {
                    occurences++;
                    System.out.println("At: x: " + x + " y: " + y);
                }
            }
        }

        System.out.println("Gesamt: " + occurences);
    }
}