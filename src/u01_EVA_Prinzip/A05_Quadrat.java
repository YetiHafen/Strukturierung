package u01_EVA_Prinzip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A05_Quadrat {

    public static void main(String[] args) {

        int a = 0;

        try {
            System.out.print("Zahl: ");
            a = Integer.parseInt(readLine());
        } catch (NumberFormatException e) {
            System.out.println("Das war keine Zahl!");
            return;
        }

        System.out.printf("%d² = %d", a, a * a);
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
