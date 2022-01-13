package u08_Methoden;

import util.Eingabe;

public class M04_Fakultaet {


    public static void main(String[] args) {
        int n = Eingabe.readInt("Zahl: ");
        System.out.println(fakultaet(n));
    }
    
    public static int fakultaet(int n) {
        if(n == 0) return 1;
        return n * fakultaet(n - 1);
    }
}
