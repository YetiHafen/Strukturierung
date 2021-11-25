package u05_whileSchleife;

import util.Eingabe;
import util.Zufall;

public class W11_Zahlenraetsel5Mal {

    public static void main(String[] args) {
        int zahl = Zufall.hundert();
        int in = -1;

        for(int i = 0; i < 5; i++) {
            in = Eingabe.readInt(">>> ");
            if(in < zahl)
                System.out.println("Größer");
            else if(in > zahl)
                System.out.println("Kleiner");
            else {
                System.out.println("Richtig");
                break;
            }
        }

        if(zahl != in)
            System.out.println("Zu viele Versuche, die Zahl war " + zahl);
    }
}
