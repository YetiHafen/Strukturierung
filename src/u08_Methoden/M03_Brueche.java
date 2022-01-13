package u08_Methoden;

import util.Eingabe;

public class M03_Brueche {

    public static void main(String[] args) {
        int z = Eingabe.readInt("Zähler: ");
        int n = Eingabe.readInt("Nenner: ");
        int ggt = ggt(z, n);
        z /= ggt;
        n /= ggt;
        System.out.println(z + "/" + n);
    }

    public static int ggt(int a, int b) {
        if(b != 0) {
            do {
                int rest = a % b;
                a = b;
                b = rest;
            } while(b != 0);
        }
        return a;
    }
}
