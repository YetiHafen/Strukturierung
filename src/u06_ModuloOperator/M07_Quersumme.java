package u06_ModuloOperator;

import util.Eingabe;

public class M07_Quersumme {

    public static void main(String[] args) {
        int in = Eingabe.readInt("Zahl: ");
        int sum = 0;
        while(in != 0) {
            sum += in % 10;
            in /= 10;
        }

        System.out.println(sum);
    }
}
