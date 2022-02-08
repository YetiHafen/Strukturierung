package u10_MehrdimArrays;

import util.Zufall;

public class MD00_TabelleStart {

    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        for(int y = 0; y < 10; y++) {
            for(int x = 0; x < 10; x++) {
                arr[x][y] = Zufall.hundert();
            }
        }

        for(int y = 0; y < 10; y++) {
            for(int x = 0; x < 10; x++) {
                System.out.print("" + x + y + " ");
            }
            System.out.println();
        }
    }
}