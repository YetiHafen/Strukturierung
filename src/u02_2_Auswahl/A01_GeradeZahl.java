package u02_2_Auswahl;

import util.Eingabe;

public class A01_GeradeZahl {

    public static void main(String[] args) {
        int test = Eingabe.readInt("Zahl: ");

        if(test % 2 == 0) {
            System.out.println("Gerade");
        } else
            System.out.println("Ungerade");
    }
}
