package u06_ModuloOperator;

import util.Eingabe;

public class M09_Dualzahlen {

    public static void main(String[] args) {
        String in = Eingabe.readString("Dualzahl eingeben: ");

        System.out.println(Integer.parseInt(in, 2));
    }
}
