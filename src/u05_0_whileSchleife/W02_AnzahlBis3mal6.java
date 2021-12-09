package u05_0_whileSchleife;

import util.Zufall;

public class W02_AnzahlBis3mal6 {

    public static void main(String[] args) {
        int sechser = 0;
        int wurf = 0;
        int wuerfe = 0;

        while(sechser < 3) {
            wurf = Zufall.wuerfeln();
            wuerfe++;
            if(wurf == 6) sechser++;
        }

        System.out.println(wuerfe);
    }
}
