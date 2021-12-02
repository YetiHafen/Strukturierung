package u06_ModuloOperator;

import util.Eingabe;

public class M10_Primzahl {

    public static void main(String[] args) {
        int in = Eingabe.readInt("Zahl: ");

        for(int i = 2; i < in; i++) {
            if (in % i == 0) {
                System.out.println("Keine Primzahl");
                return;
            }
        }
        System.out.println("Primzahl");
    }
}
