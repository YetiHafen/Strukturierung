package u06_ModuloOperator;

import util.Eingabe;

public class M02_TeilbarDurch5 {

    public static void main(String[] args) {
        int in = Eingabe.readInt(">>> ");
        if(in % 5 == 0)
            System.out.println("teilbar");
        else
            System.out.println("Nicht teilbar");
    }
}
