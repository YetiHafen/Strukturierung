package u06_ModuloOperator;

import util.Eingabe;

public class M11_ISBN_Pruefziffer {

    public static void main(String[] args) {
        long isbn = Eingabe.readLong("ISBN: ");

//        hä? hab ich die Aufgabe/ISBN nicht verstanden oder macht die Aufgabe keinen Sinn?

//        int faktor = 10;
//        int summe = 0;
//        while(isbn != 0) {
//            int ziffer = (int) (isbn % 10);
//            summe += ziffer * faktor;
//            isbn /= 10;
//        }

        if(isbn % 11 == 0) {
            System.out.println("Gültige ISBN");
        } else {
            System.out.println("Ungültige ISBN");
        }
    }
}
