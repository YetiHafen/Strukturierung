package u07_Array;

import util.Eingabe;

public class A05_TextMitIndexSuchen {

    public static void main(String[] args) {
        String[] namen = new String[10];

        for(int i = 0; i < 10; i++) {
            namen[i] = Eingabe.readString("Name: ");
        }

        int idx = Eingabe.readInt("Idx: ");

        if(idx > 0) {
            if(idx < 20) {
                System.out.println(namen[idx]);
            } else {
                System.out.println("Keine gültige Eingabe");
            }
        } else {
            System.out.println("Keine gültige Eingabe");
        }
    }
}
