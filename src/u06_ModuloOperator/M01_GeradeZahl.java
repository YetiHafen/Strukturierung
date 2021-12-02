package u06_ModuloOperator;

import util.Eingabe;

public class M01_GeradeZahl {

    public static void main(String[] args) {
        int in = Eingabe.readInt(">>> ");

        if((in & 1) == 0)
            System.out.println("Gerade");
        else
            System.out.println("Ungerade");
    }
}
