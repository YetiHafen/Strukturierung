package u06_ModuloOperator;

import util.Eingabe;

public class M05_Zifferntausch {

    public static void main(String[] args) {
        int in = Eingabe.readInt("Zahl: ");
        int rev = 0;

        while (in != 0) {
            rev *= 10;
            rev += in % 10;
            in /= 10;
        }

        System.out.println(rev);
    }
}
