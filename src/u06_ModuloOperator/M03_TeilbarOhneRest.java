package u06_ModuloOperator;

import util.Eingabe;

public class M03_TeilbarOhneRest {

    public static void main(String[] args) {
        int a = Eingabe.readInt("a: ");
        int b = Eingabe.readInt("b: ");

        if(a % b == 0)
            System.out.println("teilbar");
        else
            System.out.println("nicht teilbar");
    }
}
