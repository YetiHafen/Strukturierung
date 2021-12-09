package u05_0_whileSchleife;

import util.Eingabe;

public class W09_SummeAnzMittelMaxMin {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        float mid = 0;
        int max = 0;
        int min = 0;
        int in = 0;

        while((in = Eingabe.readInt("> ")) != -1) {
            sum += in;
            max = count == 0 ? in : Math.max(max, in);
            min = count == 0 ? in : Math.min(min, in);
            count ++;
        }
        mid = sum / (float) count;


        System.out.println("Summe: " + sum + " Anzahl: " + count + " Mitte: " + mid + " Min: " + min + " Max: " + max);
    }
}
