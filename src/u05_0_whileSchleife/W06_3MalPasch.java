package u05_0_whileSchleife;

import util.Zufall;

public class W06_3MalPasch {

    public static void main(String[] args) {
        int paschCount = 0;
        int wuerfelCount = 0;
        while(paschCount < 3) {
            if(Zufall.wuerfeln() == Zufall.wuerfeln()) paschCount++;
            wuerfelCount++;
        }

        System.out.println(wuerfelCount);
    }
}
