package u07_Array;

import util.Eingabe;

public class A02_TextArray {

    public static void main(String[] args) {
        String[] namen = new String[10];

        for(int i = 0; i < 10; i++) {
            namen[i] = Eingabe.readString(">>> ");
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(namen[i]);
        }
    }
}
