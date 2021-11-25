package u05_whileSchleife;

import util.Eingabe;
import util.Zufall;

public class W03Anzahl6AusN {
    public static void main(String[] args) {

        int n = Eingabe.readInt("Zahl: ");
        int sechser = 0;
        for(int i = 0; i < n; i++) {
            int wurf = Zufall.wuerfeln();
            if(wurf == 6) sechser++;
        }

        System.out.println(sechser);
    }
}
