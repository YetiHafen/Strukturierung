package u06_ModuloOperator;

import util.Eingabe;

public class M04_Schaltjahr {

    public static void main(String[] args) {
        int jahr = Eingabe.readInt("Jahr: ");

        if(jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
            System.out.println("schaltjahr");
        } else {
            System.out.println("kein schaltjahr");
        }
    }
}
