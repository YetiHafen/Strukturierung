package u05_whileSchleife;

import util.Eingabe;

public class W08_SummeAnzMittel {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        float mid = 0;
        int in = 0;
        while((in = Eingabe.readInt("> ")) != -1) {
            sum += in;
            count ++;
        }
        mid = sum / (float) count;

        System.out.println("Summe: " + sum + " Anzahl: " + count + " Mitte: " + mid);
    }
}
