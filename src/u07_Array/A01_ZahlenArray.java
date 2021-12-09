package u07_Array;

import util.Zufall;

public class A01_ZahlenArray {

    public static void main(String[] args) {
        int[] zahlen = new int[20];

        for(int i = 0; i < 20; i++) {
            zahlen[i] = Zufall.wuerfeln();
        }

        for(int i = 0; i < 20; i++) {
            System.out.println(zahlen[i]);
        }
    }
}
