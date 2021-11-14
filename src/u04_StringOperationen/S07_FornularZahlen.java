package u04_StringOperationen;

import util.Eingabe;

public class S07_FornularZahlen {

    public static void main(String[] args) {

        String zahl = Eingabe.readString("Zahl: ");
        String res = "";

        int length = zahl.length();
        int starsBefore = 10 - length - 1;

        for(int i = 0; i < starsBefore; i++) {
            res += '*';
        }

        res += zahl;
        res += '*';

        System.out.println(res);
    }
}
