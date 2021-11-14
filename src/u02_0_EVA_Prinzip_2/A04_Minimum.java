package u02_0_EVA_Prinzip_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A04_Minimum {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try {
            System.out.print("Zahl 1: ");
            a = Integer.parseInt(readLine());
            System.out.print("Zahl 2: ");
            b = Integer.parseInt(readLine());
        } catch (NumberFormatException e) {
            System.out.println("Das war keine gültige Zahl!");
            return;
        }

        int min = Math.min(a, b);
        System.out.printf("Min: %d", min);
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
