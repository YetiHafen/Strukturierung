package u01_EVA_Prinzip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A06_OhmschesGesetz {

    public static void main(String[] args) {
        float r = 0;
        float i = 0;

        try {
            System.out.print("R in Ω: ");
            r = Float.parseFloat(readLine());
            System.out.print("I in A: ");
            i = Float.parseFloat(readLine());
        } catch (NumberFormatException e) {
            System.out.println("Das war keine Zahl!");
            return;
        }
        System.out.printf("%fΩ x %fA = %fV", r, i, r*i);
    }

    // eigene Funktion weil ich mir das util package nicht gespeichert habe
    private static String readLine() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
